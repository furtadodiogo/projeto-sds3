package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import java.io.Serializable;
import lombok.Data;

@Data
public class SaleSumDTO implements Serializable {

    private String sellerName;

    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

}
