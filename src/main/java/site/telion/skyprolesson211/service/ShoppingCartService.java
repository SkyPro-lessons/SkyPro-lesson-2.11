package site.telion.skyprolesson211.service;

import java.util.Set;

public interface ShoppingCartService {
    Set<Integer> addProduct(String productList);

    Set<Integer> getAllProduct();
}
