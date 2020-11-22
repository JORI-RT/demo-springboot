package domain.account;

import java.time.LocalDate;

/**
 * 入荷実績
 */
public class ArrivalRecord {
    LocalDate date;
    int quantity;

    ArrivalRecord(LocalDate date, int quantiry) {
        this.date = date;
        this.quantity = quantiry;
    }

}
