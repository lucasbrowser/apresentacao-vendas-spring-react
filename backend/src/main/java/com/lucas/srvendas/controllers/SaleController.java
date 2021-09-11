package com.lucas.srvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.srvendas.dto.SaleDTO;
import com.lucas.srvendas.dto.SaleSuccessDTO;
import com.lucas.srvendas.dto.SaleSumDTO;
import com.lucas.srvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> pSaleDTO = saleService.findAll(pageable);
		return ResponseEntity.ok(pSaleDTO);
	}
	
	@GetMapping(value = "/sum-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> lSaleSumDTO = saleService.amountGroupedBySeller();
		return ResponseEntity.ok(lSaleSumDTO);
	}
	
	@GetMapping(value = "/success-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
		List<SaleSuccessDTO> lSaleSuccessDTO = saleService.successGroupedBySeller();
		return ResponseEntity.ok(lSaleSuccessDTO);
	}

}
