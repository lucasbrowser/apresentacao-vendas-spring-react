package com.lucas.srvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.srvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
