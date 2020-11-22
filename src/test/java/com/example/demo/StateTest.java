package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    void name() {
        Arrays.stream(State.values()).forEach(
                state -> System.out.println(state.name())
        );
    }

    @Test
    void namea() {
        boolean b = StateTransion.canTransit(State.審査中, State.終了);
        System.out.println("b = " + b);


    }
}