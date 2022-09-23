package com.co.compumundohipermegared.ingresos.thymeleaf.entity;

import java.util.Date;
import org.apache.catalina.User;

public class Profile {
    private String id;
    private String image;
    private String phone;
    private User user;
    private Date createAt;
    private Date updateAt;

    public Profile(String id, String image, String phone, User user, Date createAt, Date updateAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String toString() {
        return "Profile{id='" + this.id + "', image='" + this.image + "', phone='" + this.phone + "', user=" + this.user + ", createAt=" + this.createAt + ", updateAt=" + this.updateAt + "}";
    }
}
