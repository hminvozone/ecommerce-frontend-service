package com.ecommerce.thymleaf.Service;

import com.ecommerce.thymleaf.ClientDto.GetWishListProductsResponse;

public interface IWishListConsumeService {

    GetWishListProductsResponse consumeWishlistProducts(final Long id);
}
