package COMPUMUNDOHIPERMEGARED.Entidades;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    private Long nit;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private int telefono;
/*
    @ManyToOne(optional = true)
    @JoinColumn(name = "documentoIdentidad")
    private  Empleado empleado;
*/
    @OneToMany(mappedBy = "empresa")
    private Set<Empleado> empleados;

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    /*
    public Empresa(String nombre, String direccion, int telefono, String nit, Empleado empleado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.empleado = empleado;
    }

 */

    public Empresa(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }
/*
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
*/

}
