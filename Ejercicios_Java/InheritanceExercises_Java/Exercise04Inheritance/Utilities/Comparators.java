
package Utilities;

import Entities.Shape;
import java.util.Comparator;

public class Comparators {
    
    public static Comparator<Shape> sortAlphabetically = (Shape t, Shape t1) -> t.getType().compareTo(t1.getType());   
}