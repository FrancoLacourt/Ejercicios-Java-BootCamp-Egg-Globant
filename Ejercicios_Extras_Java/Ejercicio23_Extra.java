package ejercicios_java;

import java.util.Scanner;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
public class Ejercicio23_Extra {

    public static void main(String[] args) {

        String[][] array = new String[20][20];
        String[] vector = new String[5];
        
        fillArrayWithWords(array);
        showArray(array);

    }

    public static void fillArrayWithWords(String array[][]) {
        Scanner input = new Scanner(System.in);
        String word;

        int altI = (int) (Math.random() * 18);
        
        int position = 0;
        int wordNumber = 1;

        for (int i = altI; i < (altI + 5); i++) {
            System.out.println("Ingrese la palabra número " + wordNumber + ". La misma debe tener entre 3 y 5 caracteres.");
            word = input.nextLine();
            wordNumber++;

            while (word.length() < 3 || word.length() > 5) {
                System.out.println("Longitud incorrecta. La palabra debe tener entre 3 y 5 caracteres. Ingrese una nueva palabra.");
                word = input.nextLine();
            }
            int altJ = (int) (Math.random() * 15);
            for (int j = altJ; j < (altJ + word.length()); j++) {

                array[i][j] = word.substring(position, position + 1);
                position++;
            }
            position = 0;
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (array[i][j] == null) {
                    array[i][j] = String.valueOf((int)(Math.random()*10));
                }
            }
        }
        
    }
    
    public static void showArray(String array[][]) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
//Me quedaría ajustar mejor los rangos. Porque no se si de esta forma puede llegar hasta la última columna. Pero solo es eso.