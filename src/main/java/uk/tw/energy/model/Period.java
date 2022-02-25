package uk.tw.energy.model;


import java.time.LocalDate;
import java.util.Date;


public final class Period {

    private final LocalDate fromDate;
    private final LocalDate toDate;

    public Period(LocalDate fromDate, LocalDate toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }
}
