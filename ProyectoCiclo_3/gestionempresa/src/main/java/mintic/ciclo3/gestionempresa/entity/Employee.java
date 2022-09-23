package mintic.ciclo3.gestionempresa.entity;

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

    //Constructor


    public Employee(long id, String email, Profile profile, Enum_RoleName enum_roleName, Enterprise enterprise, Transaction transactions, Date updatedAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.enum_roleName = enum_roleName;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    // Metodos getter and setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getEnum_roleName() {
        return enum_roleName;
    }

    public void setEnum_roleName(Enum_RoleName enum_roleName) {
        this.enum_roleName = enum_roleName;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction transactions) {
        this.transactions = transactions;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    //to String

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", enterprise=" + enterprise +
                ", transactions=" + transactions +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                '}';
    }
}
