package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.Data;

import java.io.Serializable;

@Data
public class SellerDTO implements Serializable {
    private Long id;
    private String name;

    public SellerDTO(Seller seller) {
        id = seller.getId();
        name = seller.getName();
    }
}
