package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
public class SaleDTO implements Serializable {

    private Long id;

    private Integer visited;

    private Integer deals;

    private Double amount;

    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO(Sale sale) {
        id = sale.getId();
        visited = sale.getVisited();
        deals = sale.getDeals();
        amount = sale.getAmount();
        date = sale.getDate();
        seller = new SellerDTO(sale.getSeller());
    }

}
