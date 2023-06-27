
package Entity;


public class Account {
    
    private int accountNumber;
    private long clientId;
    private double currentBalance;
    private int interest;

    public Account() {
    }

    public Account(int accountNumber, long clientId, int currentBalance, int interest) {
        this.accountNumber = accountNumber;
        this.clientId = clientId;
        this.currentBalance = currentBalance;
        this.interest = interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public long getClientId() {
        return clientId;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public int getInterest() {
        return interest;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    
    
    @Override
    public String toString() {
        return  "Número de cuenta: " + accountNumber + ". DNI: " + clientId;
    }
    
    
}
