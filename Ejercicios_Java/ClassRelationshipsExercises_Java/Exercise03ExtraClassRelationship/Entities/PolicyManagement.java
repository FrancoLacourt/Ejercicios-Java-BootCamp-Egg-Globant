
package Entities;

import java.time.LocalDate;

public class PolicyManagement {
    
    private Vehicle vehicle;
    private Client client;
    private String policyNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private int numberOfInstallments;
    private PaymentMethod paymentMethod;
    private double totalInsuredAmount;
    private boolean includesHail;
    private double maximumHailAmount;
    private CoverageType coverageType;
}
