package com.co.compumundohipermegared.ingresos.thymeleaf.entity;

import java.util.Date;

public class Enterprise {
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private Date createdAt;
    private Date updatedAt;

    public Enterprise(long id, String name, String document, String phone, String address) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String toString() {
        return "Enterprise{id=" + this.id + ", name='" + this.name + "', document='" + this.document + "', phone='" + this.phone + "', address='" + this.address + "', createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
    }
}
