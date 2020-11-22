package domain.account;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

/**
 * 現在の値と妥当性を管理
 * 関心の対象を口座として表現する
 */
public class IPhoneAccount {

    int accountNumber;
    String name;

    @Autowired
    ArrivalHisotryRepository arrivalHisotryRepository;

    // 入荷見込み、入荷実績、出荷予定、出荷実績から、出荷可能かを判断
    public boolean shippable(int qtn, LocalDate date) {
        return false;
    }

    int arrivalSchedule() {
        ArrivalHistory arrivalHistory = arrivalHisotryRepository.get();

        return 0;

    }
}
