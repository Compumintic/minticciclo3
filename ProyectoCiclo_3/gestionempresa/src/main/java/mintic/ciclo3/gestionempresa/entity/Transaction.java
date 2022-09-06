package mintic.ciclo3.gestionempresa.entity;

import java.util.Date;

public class Transaction {
    private long id;
    private String concept;
    private float amount;
    //private User user;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;

    //Constructor
    public Transaction(long id, String concept, float amount
                       /*Enterprise enterprise, Date createdAt, Date updatedAt*/) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        /*this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;*/
    }

    //Methods getter and setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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
        return "Transaction{" +
                "id=" + id +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", enterprise=" + enterprise +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
