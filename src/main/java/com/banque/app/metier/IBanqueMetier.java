package com.banque.app.metier;

import com.banque.app.entities.Compte;
import com.banque.app.entities.Operation;
import org.springframework.data.domain.Page;

public interface IBanqueMetier {
    public Compte consulterCompte(String codeCompte) ;
    public void verser(String codeCompte, double montant);
    public void retirer(String codeCompte, double montant);
    public void faireUnVirement(String codeCompte1,String codeCompte2, double montant);
    public Page<Operation> listeOperation(String codeCompte, int page, int size);
}
