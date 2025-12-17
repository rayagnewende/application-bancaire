package com.banque.app.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OP", discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Operation implements Serializable {

    private Long numero;
    private Date dateCreation;
    private double montant ;
    @ManyToOne
    @JoinColumn(name = "CODE_CPTE")
    private Compte compte;

    public Operation() {
    }

    public Operation(Date dateCreation, double montant, Compte compte) {
        this.dateCreation = dateCreation;
        this.montant = montant;
        this.compte = compte;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }
}
