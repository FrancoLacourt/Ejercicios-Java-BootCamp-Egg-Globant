package Service;

import Entity.Points;
import java.util.Scanner;

public class PointsService {

    Points points = new Points();

    public Points createPoints() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la coordenada X del punto 1");
        points.setX1(sc.nextFloat());
        System.out.println("Ingrese la coordenada Y del punto 1");
        points.setY1(sc.nextFloat());
        System.out.println("Ingrese la coordenada X del punto 2");
        points.setX2(sc.nextFloat());
        System.out.println("Ingrese la coordenada Y del punto 2");
        points.setY2(sc.nextFloat());

        return points;
    }

    public void getDistanceBetweenPoints() {
        float x1 = points.getX1();
        float y1 = points.getY1();
        float x2 = points.getX2();
        float y2 = points.getY2();
        float distance;
        
        System.out.println("El punto 1 es: (" + x1 + "," + y1 + ")");
        System.out.println("El punto 2 es: (" + x2 + "," + y2 + ")");
        System.out.println("");
        
        distance = (float) (Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2))));
        
        System.out.println("La distancia entre los dos puntos es: " + distance);
    }
}
