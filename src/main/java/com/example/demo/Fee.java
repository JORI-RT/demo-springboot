package com.example.demo;

public interface Fee {
    Yen yen();
    String label();

    class Yen {
    }
}

class AdultFee implements Fee {

    @Override
    public Yen yen() {
        return null;
    }

    @Override
    public String label() {
        return null;
    }
}

class ChildFee implements Fee {

    @Override
    public Yen yen() {
        return null;
    }

    @Override
    public String label() {
        return null;
    }
}

class SeniorFee implements Fee {

    @Override
    public Yen yen() {
        return null;
    }

    @Override
    public String label() {
        return null;
    }
}
