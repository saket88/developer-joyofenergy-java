package uk.tw.energy.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PlanUsageCost {


    Period planUsagePeriod;
    String smartMeterId;
    String currentPlan;
    BigDecimal totalUsageCost;

    public String getCurrentPlan() {
        return currentPlan;
    }


    public Period getPlanUsagePeriod() {
        return planUsagePeriod;
    }

    public String getSmartMeterId() {
        return smartMeterId;
    }

    public BigDecimal getTotalUsageCost() {
        return totalUsageCost;
    }

    public PlanUsageCost() {
    }

    public PlanUsageCost(Period planUsagePeriod, String smartMeterId, String currentPlan, BigDecimal totalUsageCost) {
        this.planUsagePeriod = planUsagePeriod;
        this.smartMeterId = smartMeterId;
        this.currentPlan = currentPlan;
        this.totalUsageCost = totalUsageCost;
    }
}
