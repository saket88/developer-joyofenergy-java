package uk.tw.energy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.tw.energy.model.Period;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class AccountService {

    private final Map<String, String> smartMeterToPricePlanAccounts;

    @Autowired
    MeterReadingService meterReadingService;

    public AccountService(Map<String, String> smartMeterToPricePlanAccounts) {
        this.smartMeterToPricePlanAccounts = smartMeterToPricePlanAccounts;
    }

    public String getPricePlanIdForSmartMeterId(String smartMeterId) {
        return smartMeterToPricePlanAccounts.get(smartMeterId);
    }

    public BigDecimal getTotalUsageCostFor(Period period, String meterId) {
        return BigDecimal.ZERO;
    }
}
