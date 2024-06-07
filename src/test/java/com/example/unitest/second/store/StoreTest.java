package com.example.unitest.second.store;

import com.example.unitest.second.customer.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class StoreTest {

    @Test
    public void Purchase_succeeds_enough_inventory() {
        // given
        Store store = new Store();
        store.addInventory(Product.Shampoo, 10);

        Customer customer = new Customer();

        // when
        boolean result = customer.purchase(store, Product.Shampoo, 5);

        // then
        assertThat(result).isTrue();
        assertThat(store.certificateProductionCount(Product.Shampoo)).isEqualTo(5);
    }

    @Test
    public void Purchase_fails_when_not_enough_inventory() {
        // given
        Store store = new Store();
        store.addInventory(Product.Shampoo, 10);
        Customer customer = new Customer();

        // when
        boolean result = customer.purchase(store, Product.Shampoo, 15);

        // then
        assertThat(result).isFalse();
        assertThat(store.certificateProductionCount(Product.Shampoo)).isEqualTo(10);
    }
}