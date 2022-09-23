package com.co.compumundohipermegared.ingresos.thymeleaf.entity;

import java.util.Date;

public class Transaction {
    private long id;
    private String concept;
    private float amount;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;

    public Transaction(long id, String concept, float amount) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return this.concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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
        return "Transaction{id=" + this.id + ", concept='" + this.concept + "', amount=" + this.amount + ", enterprise=" + this.enterprise + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
    }
}

