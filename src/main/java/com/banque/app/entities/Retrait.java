package com.banque.app.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {
    public Retrait() {
    }

    public Retrait(Date dateCreation, double montant, Compte compte) {
        super(dateCreation, montant, compte);
    }
}
