package pl.sdacademy;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MonthlyEmployee extends Employee {
    public MonthlyEmployee(String name, String address, String bankAccount) {
        super(name, address, bankAccount);
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
