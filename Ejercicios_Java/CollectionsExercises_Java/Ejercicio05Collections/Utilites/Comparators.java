
package Utilites;

import Entities.Country;
import java.util.Comparator;

public class Comparators {
    
    public static Comparator<Country> sortAlphabetically = new Comparator<Country>() {
        @Override
        public int compare(Country t, Country t1) {
            return t.getName().compareTo(t1.getName());
        }
    };   
}