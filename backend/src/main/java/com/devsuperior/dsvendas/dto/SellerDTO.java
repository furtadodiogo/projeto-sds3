package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import java.io.Serializable;
import lombok.Data;

@Data
public class SellerDTO implements Serializable {
    private Long id;
    private String name;

    public SellerDTO(Seller seller) {
        id = seller.getId();
        name = seller.getName();
    }
}
