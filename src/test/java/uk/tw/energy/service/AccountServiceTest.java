package uk.tw.energy.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.tw.energy.domain.ElectricityReading;
import uk.tw.energy.model.Period;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AccountServiceTest {

    private static final String PRICE_PLAN_ID = "price-plan-id";
    private static final String SMART_METER_ID = "smart-meter-id";
    private static final BigDecimal TOTAL_USAGE_COST = BigDecimal.valueOf(0);

    private AccountService accountService;
    private  MeterReadingService meterReadingService;

    @BeforeEach
    public void setUp() {
        Map<String, String> smartMeterToPricePlanAccounts = new HashMap<>();
        smartMeterToPricePlanAccounts.put(SMART_METER_ID, PRICE_PLAN_ID);

        accountService = new AccountService(smartMeterToPricePlanAccounts);
        HashMap<String, List<ElectricityReading>> meterAssociatedReadings = new HashMap<>();

//        ElectricityReading electricityReading1= new ElectricityReading(Instant.now(),new BigDecimal(1.0));
//        ElectricityReading electricityReading1= new ElectricityReading(Instant.now(),new BigDecimal(1.0));
//        ElectricityReading electricityReading1= new ElectricityReading(Instant.now(),new BigDecimal(1.0));
//        ElectricityReading electricityReading1= new ElectricityReading(Instant.now(),new BigDecimal(1.0));
//        ElectricityReading electricityReading1= new ElectricityReading(Instant.now(),new BigDecimal(1.0));
//        ElectricityReading electricityReading1= new ElectricityReading(Instant.now(),new BigDecimal(1.0));
//        ElectricityReading electricityReading1= new ElectricityReading(Instant.now(),new BigDecimal(1.0));


        meterReadingService = new MeterReadingService(meterAssociatedReadings);
    }

    @Test
    public void givenTheSmartMeterIdReturnsThePricePlanId() throws Exception {
        assertThat(accountService.getPricePlanIdForSmartMeterId(SMART_METER_ID)).isEqualTo(PRICE_PLAN_ID);
    }

    @Test
    public void givenTheSmartMeterIdReturnsTheTotalUsageCostForAGivenTimePeriod() throws Exception {

        LocalDate fromDate=LocalDate.of(2022,02,14);
        LocalDate toDate=LocalDate.of(2022,02,21);
        Period period= new Period(fromDate,toDate);
        String meterId="smart-meter-0";

        assertThat(accountService.getTotalUsageCostFor(period,meterId)).isEqualTo(TOTAL_USAGE_COST);
    }
}
