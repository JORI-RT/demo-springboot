package com.example.demo;

public class Money {
    private final int MAX = 100;
    private final int MIN = 1;

    private int value;

    public Money(int value) {
        if (value > 100) {
            throw new IllegalArgumentException("金額が100より大きい");
        }
        if (value < 1) {
            throw new IllegalArgumentException("金額が1より小さい");
        }
        this.value = value;
    }

    public Money add(Money other) {
        if (!canAdd(other)) {
            throw new IllegalArgumentException("たしたら１００を超える");
        }
        int added = addValue(other);
        return new Money(added);
    }

    private int addValue(Money other) {
        return value + other.value;
    }

    private boolean canAdd(Money other) {
        if (value < 0) {
            throw new IllegalArgumentException("マイナスの金額は引けない");
        }
        return addValue(other) > MAX;
    }
}
