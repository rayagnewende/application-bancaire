package com.banque.app.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant() {

    }
    public CompteCourant(Long codeCompte, double solde, Client client, double decouvert) {
        super(codeCompte, solde, client);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
