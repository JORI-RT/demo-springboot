package domain.account;

import java.util.List;

/**
 * 出荷見込み
 */
public class ExpectedShipment {
    List<ShipmentSchedule> shipmentScheduleList;

    public ExpectedShipment(List<ShipmentSchedule> shipmentSchedules) {
        this.shipmentScheduleList = shipmentSchedules;
    }
}
