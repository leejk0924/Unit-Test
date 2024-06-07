package com.example.unitest.second.store;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private Map<Product, Integer> inventory = new HashMap<>();

    public void addInventory(Product product, int count) {
        inventory.put(product, count);
    }
    public int certificateProductionCount(Product product){
        return this.inventory.get(product);
    }

    public boolean sellProduct(Product product, int count) {
        Integer productCount = inventory.get(product);
        if (productCount > count) {
            // 제품 수량 감소
            inventory.put(Product.Shampoo, productCount - count);
            return true;
        } else {
            return false;
        }
    }
}
