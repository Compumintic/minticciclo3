package COMPUMUNDOHIPERMEGARED.Servicios;

import COMPUMUNDOHIPERMEGARED.Entidades.Empleado;
import COMPUMUNDOHIPERMEGARED.Repositorios.RepositorioUsuario;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ServicioUsuario {

    private RepositorioUsuario repositorioU;

    public ServicioUsuario(RepositorioUsuario repositorioU){
        this.repositorioU = repositorioU;
    }


    public List<Empleado> getInformacion(){
        return this.repositorioU.findAll();
    }

    public Empleado getUsuario(Long id){
        return this.repositorioU.findById(id).orElseThrow();
    }

    public Empleado crearUsuario(Empleado nuevoUsuario){
        return this.repositorioU.save(nuevoUsuario);
    }

    //public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado e){
    public Empleado actualizarEmpleado(@PathVariable Long id, Empleado e){
        Empleado empleadoActual = this.repositorioU.findById(id).orElseThrow();
        empleadoActual.setCorreo((e.getCorreo()));
        empleadoActual.setNombre(e.getNombre());
        empleadoActual.setRolEmpleado(e.getRolEmpleado());
        //empleadoActual.setDocumentoIdentidad(e.getDocumentoIdentidad());
        return this.repositorioU.save(empleadoActual);
    }

    public Empleado eliminarEmpleado(Long id){
        Empleado empleadoActual = this.repositorioU.findById(id).orElseThrow();
        this.repositorioU.deleteById(id);
        return empleadoActual;
    }
}
