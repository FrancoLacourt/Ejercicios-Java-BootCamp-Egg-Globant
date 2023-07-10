
package Service;

import Entity.Mobile;
import java.util.Scanner;

public class MobileService {
    
    Mobile cellPhone = new Mobile();
    
    public void enterCode() {
        Scanner sc = new Scanner(System.in);
        int[] code = new int [7];
        for (int i = 0; i < 7; i++) {
            code[i] = (int) (Math.random()*10+1);
        }
        cellPhone.setCode(code);
    }
    
    public Mobile loadCellPhone () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la marca del celular.");
        cellPhone.setBrand(sc.nextLine());
        System.out.println("Ingrese el precio del celular.");
        cellPhone.setPrice(sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese el modelo del celular.");
        cellPhone.setModel(sc.nextLine());
        System.out.println("Ingrese la memoria RAM del celular.");
        cellPhone.setRam(sc.nextInt());
        System.out.println("Ingrese el almacenamiento del celular.");
        cellPhone.setStorage(sc.nextInt());
        enterCode();
        
        System.out.println(cellPhone.toString());
        
        return cellPhone;
    }
}