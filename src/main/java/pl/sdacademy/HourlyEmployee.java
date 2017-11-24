package pl.sdacademy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class HourlyEmployee extends Employee {
    private static final int REGULAR_HOURS = 8;
    private static final BigDecimal OvertimeRate = new BigDecimal("1.5");

    private BigDecimal hourlyRate;
    private List<WorkingDay> workingDays;

    public HourlyEmployee(String name, String address, String bankAccount, BigDecimal hourlyRate, List<WorkingDay> workingDays) {
        super(name, address, bankAccount);
        this.hourlyRate = hourlyRate;
        this.workingDays = workingDays;
    }

    @Override
    public boolean isPaymentDay(LocalDate day) {
        return false;
    }

    @Override
    public BigDecimal calculatePayment(LocalDate day) {
        return null;
    }
}
