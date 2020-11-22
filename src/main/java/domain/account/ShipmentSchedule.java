package domain.account;

import java.time.LocalDate;

public class ShipmentSchedule {
    LocalDate date;
    private final int quantity;
    int quantiry;

    public ShipmentSchedule(LocalDate date, int quantity) {

        this.date = date;
        this.quantity = quantity;
    }
}
