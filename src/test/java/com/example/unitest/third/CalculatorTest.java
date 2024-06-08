package com.example.unitest.third;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {
    @Test
    public void sum_of_two_numbers() {
        // arrange = given
        double first = 10;
        double second = 20;
        Calculator calculator = new Calculator();

        // act = when
        double result = calculator.sum(first, second);

        // assert = then
        assertThat(result).isEqualTo(30);
    }

}