package com.example.demo;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateTransion {
    static private Map<State, Set<State>> allowed;

    static {
        allowed = new HashMap<>();
        allowed.put(State.審査中, EnumSet.of(State.実施中, State.差し戻し中));
    }

    static public boolean canTransit(State from, State to) {
        Set<State> allowedStatus = allowed.get(from);
        return allowedStatus.contains(to);
    }
}
