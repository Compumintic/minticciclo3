package com.co.compumundohipermegared.ingresos.thymeleaf.entity;

import java.util.Date;

public class Employee {
    private long id;
    private String email;
    private Profile profile;
    private Enum_RoleName enum_roleName;
    private Enterprise enterprise;
    private Transaction transactions;
    private Date updatedAt;
    private Date createdAt;

    public Employee(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction getTransactions() {
        return this.transactions;
    }

    public void setTransactions(Transaction transactions) {
        this.transactions = transactions;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String toString() {
        return "Employee{id=" + this.id + ", email='" + this.email + "', enterprise=" + this.enterprise + ", transactions=" + this.transactions + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + "}";
    }
}

