package com.banque.app.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {
    public Versement() {
    }

    public Versement(Date dateCreation, double montant, Compte compte) {
        super(dateCreation, montant, compte);
    }
}
