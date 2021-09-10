package com.lucas.srvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.srvendas.dto.SaleDTO;
import com.lucas.srvendas.entities.Sale;
import com.lucas.srvendas.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public List<SaleDTO> findAll() {
		List<Sale> result = saleRepository.findAll();
		return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
	}

}
