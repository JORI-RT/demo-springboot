package com.example.demo;

public class EnumSample {
    enum FeeType {
        adult(new AdultFee()),
        child(new ChildFee()),
        senior(new SeniorFee());
        private Fee fee;

        FeeType(Fee fee) {
            this.fee = fee;
        }

        Fee.Yen yen() {
            return fee.yen();
        }
    }

    class Guest {
        FeeType type;

        boolean isAdult() {
            return type.equals(FeeType.adult);
        }
    }
}
