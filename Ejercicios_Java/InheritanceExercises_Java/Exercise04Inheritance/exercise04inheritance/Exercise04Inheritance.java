package exercise04inheritance;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Services.CircleService;
import Services.RectangleService;
import Utilities.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise04Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        int circleNumber = 0;
        int rectangleNumber = 0;

        RectangleService rs = new RectangleService();

        CircleService cs = new CircleService();

        ArrayList<Shape> shapes = new ArrayList();

        while (!exit) {
            System.out.println("1. Add geometric shape.");
            System.out.println("2. Show all geometric shapes with their respective areas and perimeters.");
            System.out.println("3. Show number of geometric shapes.");
            System.out.println("4. Exit");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    System.out.println("Would you like to add a Rectangle or a Circle");
                    option = sc.nextLine();
                    System.out.println("");

                    while (!option.equalsIgnoreCase("Rectangle") && !option.equalsIgnoreCase("Circle")) {
                        System.out.println("Invalid response, please enter Rectangle or Circle.");
                        option = sc.nextLine();
                        System.out.println("");
                    }

                    if (option.equalsIgnoreCase("Rectangle")) {

                        System.out.println("Enter the base of the rectangle (cm).");
                        Double base = sc.nextDouble();

                        while (base <= 0) {
                            System.out.println("Error. The base of the rectangle must be greater than 0. Please enter the base again.");
                            base = sc.nextDouble();
                        }
                        sc.nextLine();

                        System.out.println("Enter the height of the rectangle (cm).");
                        Double height = sc.nextDouble();

                        while (height <= 0) {
                            System.out.println("Error. The height of the rectangle must be greater than 0. Please enter the height again.");
                            height = sc.nextDouble();
                        }
                        sc.nextLine();

                        Rectangle r = rs.createRectangle(base, height);

                        shapes.add(r);

                        rectangleNumber += 1;
                        System.out.println("Rectangle was succesfully added.");

                    } else {
                        System.out.println("Enter the radio of the circle (cm).");
                        Double radio = sc.nextDouble();

                        while (radio <= 0) {
                            System.out.println("Error. The radio of the circle must be greater than 0. Please enter the radio again.");
                            radio = sc.nextDouble();
                        }
                        sc.nextLine();

                        System.out.println("Enter the diameter of the circle (cm).");
                        Double diameter = sc.nextDouble();

                        while (diameter <= 0) {
                            System.out.println("Error. The diameter of the circle must be greater than 0. Please enter the diameter again.");
                            diameter = sc.nextDouble();
                        }
                        sc.nextLine();

                        Circle c = cs.createCircle(radio, diameter);
                        shapes.add(c);
                        circleNumber += 1;
                        System.out.println("Circle was succesfully added.");
                    }

                    System.out.println("");
                    break;

                case 2:
                    Collections.sort(shapes, Comparators.sortAlphabetically);
                    if (shapes.isEmpty()) {
                        System.out.println("There are no geometric shapes yet.");
                    } else {
                        for (Shape shape : shapes) {
                            System.out.println(shape.toString());
                        }
                    }

                    System.out.println("");
                    break;
                case 3:

                    if (shapes.isEmpty()) {
                        System.out.println("There are no geometric shapes yet.");
                    } else {
                        if (shapes.size() == 1) {
                            System.out.println("There is one geometric shape.");
                            if (rectangleNumber == 0) {
                                System.out.println(circleNumber + " circle.");
                            } else {
                                System.out.println(rectangleNumber + " rectangle.");
                            }
                        } else {
                            System.out.println("There are " + shapes.size() + " geometric shapes.");
                            if (rectangleNumber == 0) {
                                System.out.println(circleNumber + " circles.");
                            } else if (circleNumber == 0) {
                                System.out.println(rectangleNumber + " rectangles.");
                            } else {
                                System.out.println(rectangleNumber + " rectangles.");
                                System.out.println(circleNumber + " circles.");
                            }
                        }
                    }

                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Exiting the menu...");
                    exit = true;
                    break;
                default:
                    System.out.println("Error. You must choose a valid option.");
                    System.out.println("");
            }
        }
    }
}

/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
*/
