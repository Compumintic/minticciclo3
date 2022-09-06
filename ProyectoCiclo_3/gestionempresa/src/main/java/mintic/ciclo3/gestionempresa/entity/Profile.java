package mintic.ciclo3.gestionempresa.entity;

import org.apache.catalina.User;

import java.util.Date;

public class Profile {
    private String id;
    private String image;
    private String phone;
    private User user;
    private Date createAt;
    private Date updateAt;


    //Constructor
    public Profile(String id, String image, String phone,
                   User user, Date createAt, Date updateAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    //Methods getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    //toString

    @Override
    public String toString() {
        return "Profile{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
