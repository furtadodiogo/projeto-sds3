package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import java.io.Serializable;
import lombok.Data;

@Data
public class SaleSuccsessDTO implements Serializable {

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccsessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

}
