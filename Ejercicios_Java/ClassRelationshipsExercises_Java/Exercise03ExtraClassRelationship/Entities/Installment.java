
package Entities;

import java.time.LocalDate;

public class Installment {
    
    private int installmentNumber;
    private double totalInstallmentAmount;
    private boolean paid;
    private LocalDate dueDate;
    private PaymentMethod paymentMethod;
    
}
