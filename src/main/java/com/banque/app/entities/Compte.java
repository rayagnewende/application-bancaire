package com.banque.app.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE", discriminatorType = DiscriminatorType.STRING, length = 2)
public abstract class Compte implements Serializable {
    @Id @GeneratedValue
    private Long codeCompte;
    private Date dateCreation;
    private double solde ;
    @ManyToOne
    @JoinColumn(name = "CODE_CLI")
    private Client client ;
    @OneToMany(mappedBy = "compte")
    private Collection<Operation> operations ;

    public Compte() {
    }

    public Compte(Long codeCompte, double solde, Client client) {
        this.codeCompte = codeCompte;
        this.solde = solde;
        this.client = client;
    }

    public Long getCodeCompte() {
        return codeCompte;
    }

    public void setCodeCompte(Long codeCompte) {
        this.codeCompte = codeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }
}
