
package Service;

import Entity.Nif;
import java.util.Scanner;



public class NifService {
    private Nif nif = new Nif();
    
    public Nif createNif() {
        Scanner sc = new Scanner(System.in);
        
        String vector [] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        System.out.println("Ingrese su DNI por favor.");
        nif.setId(sc.nextLong());
        System.out.println("La letra que le corresponde es: ");
        nif.setLetter(vector[(int) (nif.getId()%23)]);
        System.out.println(nif.getLetter());
        System.out.println("");
        
        return nif;
    }
    
    public void showNif() {
        String id = String.format("%08d", nif.getId()); //"%08d" es para que le agregue los 0 que sean necesarios hasta llegar a 8 dígitos.
        System.out.println("su NIF es: " + id + "-" + nif.getLetter());   
    }
}