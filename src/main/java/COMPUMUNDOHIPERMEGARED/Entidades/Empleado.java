package COMPUMUNDOHIPERMEGARED.Entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    private Long documentoIdentidad;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "rolempleado")
    private String rolEmpleado;

    @OneToMany(mappedBy = "empleadores")
    private Set<MovimientoDinero> movimientodinero;


    @ManyToOne(optional = false)
    @JoinColumn(name = "nit",nullable = false) //debe relacionarlo con un empleado
    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public  Empleado(){

    }
/*
    public Empleado(String nombre, String correo, String empresaEmpleadoPertenece, String rolEmpleado, MovimientoDinero movimientodinero) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
        this.rolEmpleado = rolEmpleado;
        this.movimientodinero = movimientodinero;
    }

 */


    public Long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Set<MovimientoDinero> getMovimientodinero() {
        return movimientodinero;
    }

    public void setMovimientodinero(Set<MovimientoDinero> movimientodinero) {
        this.movimientodinero = movimientodinero;
    }




}
