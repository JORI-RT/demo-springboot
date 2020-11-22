package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void name() {
        Money money = new Money(1);
        Money money1 = new Money(100);
        money.add(money1);

    }
}