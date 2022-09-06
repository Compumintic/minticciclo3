package mintic.ciclo3.gestionempresa.entity;

import java.util.Date;

public class Enterprise {

    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    //private User users [];
    //private Transaction transactions [];
    private Date createdAt;
    private Date updatedAt;

    //Constructor
    public Enterprise(long id, String name, String document, String phone,
                      String address /*, Date createdAt, Date updatedAt*/) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        /*this.createdAt = createdAt;
        this.updatedAt = updatedAt;*/
    }

    //Methods getter and setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    //toString
    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
