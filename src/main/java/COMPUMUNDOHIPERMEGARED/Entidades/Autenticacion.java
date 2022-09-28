package COMPUMUNDOHIPERMEGARED.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Autenticacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "auth0Id", unique = true)
    private String auth0Id;

    public Autenticacion(){

    }

    public Autenticacion(String email, String imagen, String auth0Id, String nickname) {
        this.email = email;
        this.imagen = imagen;
        this.auth0Id = auth0Id;
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
