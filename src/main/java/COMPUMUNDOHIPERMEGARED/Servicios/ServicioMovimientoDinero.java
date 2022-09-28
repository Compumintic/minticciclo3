package COMPUMUNDOHIPERMEGARED.Servicios;

import COMPUMUNDOHIPERMEGARED.Entidades.MovimientoDinero;
import COMPUMUNDOHIPERMEGARED.Repositorios.RepositorioMovimientoDinero;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ServicioMovimientoDinero {

    private RepositorioMovimientoDinero repositorioMD;

    public ServicioMovimientoDinero(RepositorioMovimientoDinero repositorioMD){
        this.repositorioMD = repositorioMD;
    }


    public List<MovimientoDinero> getInformacion(){
        return this.repositorioMD.findAll();
    }

    public MovimientoDinero getMovimiento(Long id){
        return this.repositorioMD.findById(id).orElseThrow();
    }
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero nuevoMovimientoDinero){
        return this.repositorioMD.save(nuevoMovimientoDinero);
    }

    public MovimientoDinero actualizarMovimientoDinero(@PathVariable Long id, @RequestBody MovimientoDinero md){
        MovimientoDinero movimientoDineroActual = this.repositorioMD.findById(id).orElseThrow();
        movimientoDineroActual.setConceptoMovimiento(md.getConceptoMovimiento());
        movimientoDineroActual.setMontoMovimiento(md.getMontoMovimiento());
        return this.repositorioMD.save(movimientoDineroActual);
    }

    public MovimientoDinero eliminarMovimientoDinero(Long id){
        MovimientoDinero movimientoDineroActual = this.repositorioMD.findById(id).orElseThrow();
        this.repositorioMD.deleteById(id);
        return movimientoDineroActual;
    }

}
