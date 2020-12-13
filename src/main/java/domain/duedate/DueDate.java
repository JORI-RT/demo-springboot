package domain.duedate;

import java.time.LocalDate;

public class DueDate {
    LocalDate dueDate;

    // 期限切れか
    boolean isExpired() {
        return false;
    }

    // その日は期限切れか
    boolean isExpiredOn(LocalDate date) {
        return false;
    }

    // 期限までの日数
    int remainingDays() {
        return 0;
    }

    AlertType alertTyep() {
        // 期限切れの警告度合い
        return AlertType.big;
    }

}

enum AlertType {
    big,
    meiam,
    small
}
