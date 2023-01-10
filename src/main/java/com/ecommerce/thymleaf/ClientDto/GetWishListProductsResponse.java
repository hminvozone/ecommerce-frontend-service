package com.ecommerce.thymleaf.ClientDto;

import com.ecommerce.thymleaf.Models.Products;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@Data
public class GetWishListProductsResponse {

    @JsonProperty(value = "products")
    private List<Products> products = new ArrayList<>();

    public GetWishListProductsResponse() {
    }

    public GetWishListProductsResponse(List<Products> products) {
        this.products = products;
    }
}
