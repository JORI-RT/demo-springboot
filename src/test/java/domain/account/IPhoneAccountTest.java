package domain.account;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IPhoneAccountTest {
    @DisplayName("")
    @Test
    void test01() {
        ExpectedArrival expectedArrival = new ExpectedArrival(arrivalSchedules());
        ExpectedShipment expectedShipment = new ExpectedShipment(shipmentSchedules());
        ArrivalHistory arrivalHistory = new ArrivalHistory(arrivalRecords());
        ShipmentHisotry shipmentHisotry = new ShipmentHisotry(shipmentRecords());

    }

    private List<ArrivalRecord> arrivalRecords() {
        return List.of(
                new ArrivalRecord(LocalDate.of(2020, 1, 1), 2),
                new ArrivalRecord(LocalDate.of(2020, 1, 3), 5)
        );
    }

    private List<ShipmentRecord> shipmentRecords() {
        return List.of(
                new ShipmentRecord(LocalDate.of(2020, 1, 1), 2),
                new ShipmentRecord(LocalDate.of(2020, 1, 3), 5)
        );
    }

    private List<ArrivalSchedule> arrivalSchedules() {
        return List.of(
                new ArrivalSchedule(LocalDate.of(2020, 1, 1), 2),
                new ArrivalSchedule(LocalDate.of(2020, 1, 3), 5)
        );
    }

    private List<ShipmentSchedule> shipmentSchedules() {
        return List.of(
                new ShipmentSchedule(LocalDate.of(2020, 1, 1), 2),
                new ShipmentSchedule(LocalDate.of(2020, 1, 3), 5)
        );
    }
}