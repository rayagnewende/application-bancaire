package com.banque.app.metier;

import com.banque.app.dao.CompteRepository;
import com.banque.app.dao.OperationRepository;
import com.banque.app.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;

public class BanqueMetier implements IBanqueMetier {
    @Autowired
    CompteRepository compteRepository;
    @Autowired
    OperationRepository operationRepository;

    @Override
    public Compte consulterCompte(String codeCompte) {
       return compteRepository.findById(codeCompte)
               .orElseThrow(() -> new RuntimeException("Compe introuvable"));
    }

    @Override
    public void verser(String codeCompte, double montant) {
       Compte compte = consulterCompte(codeCompte);
        Versement versement = new Versement(new Date(),montant, compte );
        operationRepository.save(versement);
        compte.setSolde(compte.getSolde() + montant);
        compteRepository.save(compte);
    }

    @Override
    public void retirer(String codeCompte, double montant) {
        Compte compte = consulterCompte(codeCompte);
        double facilitéDeCaisse = 0;

        if( compte instanceof CompteCourant) facilitéDeCaisse = ((CompteCourant) compte).getDecouvert();
        if((facilitéDeCaisse + compte.getSolde()) < montant)
        {
            throw new RuntimeException("Solde Insuffisant!!");
        }

        Retrait r  = new Retrait(new Date(),montant, compte );
        operationRepository.save(r);
        compte.setSolde(compte.getSolde() + montant);
        compteRepository.save(compte);
    }

    @Override
    public void faireUnVirement(String codeCompte1, String codeCompte2, double montant) {
        retirer(codeCompte1, montant);
        verser(codeCompte2, montant);
    }

    @Override
    public Page<Operation> listeOperation(String codeCompte, int page, int size) {
        return operationRepository.listeOperation(codeCompte, PageRequest.of(page, size));
    }


}
