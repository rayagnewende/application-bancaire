package com.banque.app.dao;

import com.banque.app.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OperationRepository extends JpaRepository<Operation, Long> {
    @Query("select o from Operation o where o.compte.codeCompte = :x order by o.dateCreation desc")
    Page<Operation> listeOperation(@Param("x") String codeCompte, Pageable pageable);

}
