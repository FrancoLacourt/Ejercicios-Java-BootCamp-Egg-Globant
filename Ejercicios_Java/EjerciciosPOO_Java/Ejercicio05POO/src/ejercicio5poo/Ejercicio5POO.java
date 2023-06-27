/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

*/


package ejercicio5poo;

import Entity.Account;
import Service.AccountService;
import java.util.Scanner;


public class Ejercicio5POO {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int option;
        
        AccountService as = new AccountService();
        
        System.out.println("BANCO SANTANDER");
        System.out.println("");
        
        Account a1 = as.createAccount();
        
        
        while (!exit) {
            
            System.out.println("1. Ingresar dinero.");
            System.out.println("2. Retirar dinero.");
            System.out.println("3. Extracción rápida. Solo puede sacar hasta un 20% del saldo.");
            System.out.println("4. Consultar saldo.");
            System.out.println("5. Consultar datos de la cuenta.");
            System.out.println("6. Salir de la cuenta.");
            
            System.out.println("Ingrese la opción que desee.");
            option = input.nextInt();
            
            switch (option) {
                case 1:
                    as.deposit(a1);
                    System.out.println("");
                    break;
                case 2:
                    as.withdraw(a1);
                    System.out.println("");
                    break;
                case 3:
                    as.fastWithdraw(a1);
                    System.out.println("");
                    break;
                case 4:
                    as.checkBalance(a1);
                    System.out.println("");
                    break;
                case 5:
                    as.checkUserInfo(a1);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Saliendo de la cuenta...");
                    exit = true;
                    break;
            }
            
        }
        
    }
    
}
