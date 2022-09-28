package COMPUMUNDOHIPERMEGARED.Controladores;

import COMPUMUNDOHIPERMEGARED.Entidades.Empresa;
import COMPUMUNDOHIPERMEGARED.Servicios.ServicioEmpresa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorEmpresa {

    ServicioEmpresa se1;


    public ControladorEmpresa(ServicioEmpresa se1){
        this.se1 = se1;
    }

    @GetMapping("/enterprise")
    public List<Empresa> informacion(){
        return this.se1.getInformacion();
    }





    @PostMapping("/enterprise")
    public Empresa crearEmpresa(@RequestBody Empresa e){
        return this.se1.crearEmpresa(e);
    }

    @PutMapping("/enterprise/{id}")
    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa e){
        return this.se1.actualizarEmpresa(id, e);
    }

    @DeleteMapping("/enterprise/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.se1.eliminarEmpresa(id);
    }

}
