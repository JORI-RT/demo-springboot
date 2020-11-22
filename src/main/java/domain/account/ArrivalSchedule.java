package domain.account;

import java.time.LocalDate;

/**
 * 入荷予定
 */
public class ArrivalSchedule {
    LocalDate date;
    int quantity;

    public ArrivalSchedule(LocalDate date, int quantity) {

        this.date = date;
        this.quantity = quantity;
    }
}
