
package Service;

import Entity.Account;
import java.util.Scanner;


public class AccountService {
    
    public Account createAccount() {
        Scanner input = new Scanner(System.in);
        
        Account a1 = new Account();
        
        System.out.println("Ingrese su número de cuenta.");
        a1.setAccountNumber(input.nextInt());
        System.out.println("Ingrese su DNI.");
        a1.setClientId(input.nextLong());
        a1.setCurrentBalance((Math.random()*100000 + 1));
        
        return a1;
    }
    
    public void deposit(Account a1) {
        Scanner input = new Scanner(System.in);
        double currentBalance = a1.getCurrentBalance();
        
        System.out.println("Cuánto dinero desea ingresar?");
        a1.setCurrentBalance((currentBalance + input.nextDouble()));
    }
    
    public void withdraw(Account a1) {
        Scanner input = new Scanner(System.in);
        double currentBalance = a1.getCurrentBalance();
        double money;
        
        System.out.println("Cuánto dinero desea retirar?");
        money = input.nextDouble();
        
        if (money > currentBalance) {
            a1.setCurrentBalance(0);
        } else {
            a1.setCurrentBalance(((currentBalance) - (money)));
        }
    }
    
    public void fastWithdraw(Account a1) {
        Scanner input = new Scanner(System.in);
        double currentBalance = a1.getCurrentBalance();
        double money;
        
        System.out.println("Cuánto dinero desea retirar? Solo puede retirar hasta un 20% de su saldo.");
        money = input.nextDouble();
        
        if (money > (currentBalance * 0.2)) {
            System.out.println("Error. El monto que desea retirar es mayor al 20% de su saldo.");
        } else {
            a1.setCurrentBalance(((currentBalance) - (money)));
        }
    }
    
    public void checkBalance(Account a1) {
        System.out.println("Su saldo actual es: $" + a1.getCurrentBalance());
    }
    
    public void checkUserInfo(Account a1) {
        System.out.println(a1);
    }
}