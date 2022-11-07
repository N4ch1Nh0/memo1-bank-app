package com.aninfo.model;

import javax.persistence.*;

@Entity
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long cbu;
    private String type;
    private Long id;
    private Double mount;

    public BankTransaction() {
    }

    public BankTransaction(Long transactionCbu, String transactionType, Long transactionId, Double transactionMount) {
        this.cbu = transactionCbu;
        this.type = transactionType;
        this.id = transactionId;
        this.mount = transactionMount;
    }

    public void setCbu(Long newCbu) {this.cbu = newCbu;}

    public void setType(String newType) {this.type = newType;}

    public void setId(Long newId) {this.id = newId;}

    public void setMount(Double newMount) {this.mount = newMount;}

    public long getCbu() {return this.cbu;}

    public long getId() {return this.id;}

    public String getType() {return this.type;}

    public double getMount(){return this.mount;}

}
