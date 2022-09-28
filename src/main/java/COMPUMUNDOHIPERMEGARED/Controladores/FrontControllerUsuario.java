package COMPUMUNDOHIPERMEGARED.Controladores;

import COMPUMUNDOHIPERMEGARED.Entidades.Autenticacion;
import COMPUMUNDOHIPERMEGARED.Entidades.Empleado;
import COMPUMUNDOHIPERMEGARED.Entidades.MovimientoDinero;
import COMPUMUNDOHIPERMEGARED.Servicios.ServicioAutenticacion;
import COMPUMUNDOHIPERMEGARED.Servicios.ServicioMovimientoDinero;
import COMPUMUNDOHIPERMEGARED.Servicios.ServicioUsuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FrontControllerUsuario {

    ServicioUsuario su1;
    ServicioMovimientoDinero smd1;
    ServicioAutenticacion sauth;

    public FrontControllerUsuario(ServicioUsuario su1, ServicioMovimientoDinero smd1,
                                  ServicioAutenticacion sauth){
        this.su1 = su1;
        this.smd1 = smd1;
        this.sauth = sauth;
    }


    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
            System.out.println(principal.getClaims());
            Autenticacion usuario = this.sauth.getOrCreateAuth(principal.getClaims());
            model.addAttribute("auth", usuario);
        }
        return "index";
    }

    @GetMapping("/user")
    public String informacion(Model model){
        List<Empleado> listaEmpleados = this.su1.getInformacion();
        List<MovimientoDinero> lsitamovimientos = this.smd1.getInformacion();
        model.addAttribute("listaDeEmpleados", listaEmpleados);
        model.addAttribute("listaDeMovimientos", lsitamovimientos);
        return "usuarios";
    }

    @GetMapping("/user/nuevo")
    public String nuevoEmpleado(Model model){
        model.addAttribute("nuevoempleado", new Empleado());
        return "nuevoUsuario";
    }

    @GetMapping("/user/{id}")
    public String actualizarEmpleado(@PathVariable Long id, Model model){
        Empleado actualizar = this.su1.getUsuario(id);
        model.addAttribute( "actualizarE", actualizar);
        return "actualizarUsuario";
    }

    @GetMapping("/user/nuevo-movimiento")
    public String nuevoMovimiento(Model model){
        model.addAttribute("nuevomovimiento", new MovimientoDinero());
        return "nuevoMovimiento";
    }
/*
    @GetMapping("/user/nuevo-movimiento/{id}")
    public String actualizarmovimiento(@PathVariable Long id, Model model){
        MovimientoDinero actualizar = this.smd1.getMovimiento(id);
        model.addAttribute( "actualizarM", actualizar);
        return "actualizarUsuario";
    }

 */
}
