package com.banque.app.dao;

import com.banque.app.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OperationRepository extends JpaRepository<Operation, Long> {
    @Query("select o from operation o where o.compte.codeCompte=:x order by o.dateCreation desc ")
    public Page<Operation> listeOperation(String codeCompte, Pageable pageable);
}
