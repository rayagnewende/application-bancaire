package com.banque.app;

import com.banque.app.dao.ClientRepository;
import com.banque.app.dao.CompteRepository;
import com.banque.app.dao.OperationRepository;
import com.banque.app.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
  /*  @Autowired
    ClientRepository clientRepository ;
	@Autowired
	CompteRepository compteRepository ;
	@Autowired
	OperationRepository operationRepository;  */

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Client c1 = clientRepository.save(new Client("Kabore", "evariste@gmail.com"));
		Client c2 = clientRepository.save(new Client("Kabre", "paul@gmail.com"));

		Compte cpte1 = compteRepository.save(new CompteCourant("c1",new Date(), 10000,c1,1000));
		Compte cpte2 = compteRepository.save(new CompteEpargne("c2",new Date(), 10000,c1,5.0));

        operationRepository.save(new Versement(new Date(),2000,cpte1));
		operationRepository.save(new Versement(new Date(),3000,cpte2));
		operationRepository.save(new Retrait(new Date(),1000,cpte1));
		operationRepository.save(new Retrait(new Date(),500,cpte1));   */






	}
}
