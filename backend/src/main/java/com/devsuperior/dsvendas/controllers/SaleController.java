package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccsessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> saleDTOPage = saleService.findAll(pageable);
        return ResponseEntity.ok(saleDTOPage);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupdBySeller() {
        List<SaleSumDTO> sumDTOList = saleService.amountGroupdBySeller();
        return ResponseEntity.ok(sumDTOList);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccsessDTO>> successGroupdBySeller() {
        List<SaleSuccsessDTO> succsessDTOList = saleService.successGroupdBySeller();
        return ResponseEntity.ok(succsessDTOList);
    }

}
