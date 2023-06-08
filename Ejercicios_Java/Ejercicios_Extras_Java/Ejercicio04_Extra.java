package ejercicios_java;

import java.util.Scanner;

/*  Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.
*/

public class Ejercicio04_Extra {

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            int num;
            
            System.out.println("Ingrese un número del 1 al 10 y se le mostrará el equivalente en romano.");
            num = input.nextInt();
            
            while (num < 1 || num > 10) {
                System.out.println("El número debe estar entre 1 y 10. Ingrese un nuevo número.");
                num = input.nextInt();
            }
            System.out.println("");
            
            pasarNumRomano(num);

        }
        
        public static void pasarNumRomano (int num) {
            
           String numRomano= Integer.toString(num);
            
            switch (num) {
                case 1:
                    numRomano = "I";
                    break;
                case 2:
                    numRomano = "II";
                    break;
                case 3:
                    numRomano = "III";
                    break;
                case 4: 
                    numRomano = "IV";
                    break;
                case 5 :
                    numRomano = "V";
                    break;
                case 6:
                    numRomano = "VI";
                    break;
                case 7:
                    numRomano = "VII";
                    break;
                case 8:
                    numRomano = "VIII";
                    break;
                case 9:
                    numRomano = "IX";
                    break;
                case 10:
                    numRomano = "X";
                    break;
            }   
            System.out.println("El número " + num + " en números romanos es: " + numRomano);   
        }
    }