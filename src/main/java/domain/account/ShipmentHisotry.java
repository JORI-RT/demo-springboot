package domain.account;

import java.util.List;

/**
 * 出荷履歴
 */
public class ShipmentHisotry {
    public ShipmentHisotry(List<ShipmentRecord> shipmentRecordList) {
        this.shipmentRecordList = shipmentRecordList;
    }

    List<ShipmentRecord> shipmentRecordList;
}
