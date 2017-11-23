package pl.sdacademy;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String address;
    private String bankAccount;

    public Employee(String name, String address, String bankAccount) {
        this.name = name;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public abstract boolean isPaymentDay(LocalDate day);


    /**
     *  
     * @param day
     * @return
     */
    public abstract BigDecimal calculatePayment(LocalDate day);
}
