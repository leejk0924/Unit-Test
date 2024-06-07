package com.example.unitest.second.customer;

import com.example.unitest.second.store.Product;
import com.example.unitest.second.store.Store;

import java.util.Map;

public class Customer {
    private Map<Product, Integer> inventory;

    public boolean purchase(Store store, Product product, int count) {
        return store.sellProduct(product, count);
    }
}
