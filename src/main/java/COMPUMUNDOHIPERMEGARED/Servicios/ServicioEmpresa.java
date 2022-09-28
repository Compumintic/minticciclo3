package COMPUMUNDOHIPERMEGARED.Servicios;

import COMPUMUNDOHIPERMEGARED.Entidades.Empresa;
import COMPUMUNDOHIPERMEGARED.Repositorios.RepositorioEmpresa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ServicioEmpresa {

    //ServicioUsuario se1 = new ServicioUsuario();

    private RepositorioEmpresa repositorioE;

    public ServicioEmpresa(RepositorioEmpresa repositorioE){
        this.repositorioE = repositorioE;
    }


    public List<Empresa> getInformacion(){
        return this.repositorioE.findAll();
    }

    public Empresa crearEmpresa(Empresa nuevaEmpresa){
        return this.repositorioE.save(nuevaEmpresa);
    }

    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa e){
        Empresa empresaActual = this.repositorioE.findById(id).orElseThrow();
        empresaActual.setNombre(e.getNombre());
        empresaActual.setDireccion(e.getDireccion());
        empresaActual.setTelefono(e.getTelefono());
        //empresaActual.setNit(e.getNit());
        return this.repositorioE.save(empresaActual);
    }

    public Empresa eliminarEmpresa(Long id){
        Empresa empresaActual = this.repositorioE.findById(id).orElseThrow();
        this.repositorioE.deleteById(id);
        return empresaActual;
    }
}
