package com.ecommerce.thymleaf.Clients;

import com.ecommerce.thymleaf.ClientDto.GetWishListProductsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "wishListClient", url = "http://localhost:8080/v1/api/wishlist_products")
public interface WishListClient {

    @GetMapping(value ="/{wishlist_id}")
    GetWishListProductsResponse getWishListById(@PathVariable("wishlist_id") Long wishlist_id);

    @PostMapping(value ="/{wishlist_id}/{product_id}")
    void addProduct(@PathVariable("wishlist_id") Long wishlist_id, @PathVariable("product_id") Long product_id);

    @DeleteMapping(value ="/{wishlist_id}/{product_id}")
    void removeProduct(@PathVariable("wishlist_id") Long wishlist_id, @PathVariable("product_id") Long product_id);
}
