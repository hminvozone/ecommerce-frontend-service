package com.ecommerce.thymleaf.Service;

import com.ecommerce.thymleaf.ClientDto.GetWishListProductsResponse;
import com.ecommerce.thymleaf.Clients.WishListClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishListConsumeService implements IWishListConsumeService {

    private final WishListClient wishListClient;

    @Autowired
    public WishListConsumeService(WishListClient wishListClient) {
        this.wishListClient = wishListClient;
    }

    @Override
    public GetWishListProductsResponse consumeWishlistProducts(final Long id) {
        return wishListClient.getWishListById(id);
    }
}
