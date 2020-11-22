package domain.account;

import java.util.List;

/**
 * 入荷履歴
 */
public class ArrivalHistory {
    List<ArrivalRecord> arrivalRecords;
    ArrivalHistory(List<ArrivalRecord> arrivalRecords){
       this.arrivalRecords = arrivalRecords;
    }
}
