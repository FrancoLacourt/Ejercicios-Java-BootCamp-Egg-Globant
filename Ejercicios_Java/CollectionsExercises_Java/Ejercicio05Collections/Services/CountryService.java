package Services;

import Entities.Country;
import Utilites.Comparators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CountryService {

    private TreeSet<Country> countries = new TreeSet(Comparators.sortAlphabetically);
    private ArrayList<String> listOfCountriesAsStrings = new ArrayList();

    public Country createCountry(String name) {
        return new Country(name);
    }

    public void addCountryToTheList(Country country) {
        countries.add(country);
        updateListOfCountriesAsStrings();
    }

    public void createAndAdd(String name) {
        Country country = createCountry(name);
        addCountryToTheList(country);
    }

    public ArrayList<String> getListOfCountriesAsStrings() {
        return listOfCountriesAsStrings;
    }

    public void updateListOfCountriesAsStrings() {
        listOfCountriesAsStrings.clear();
        for (Country country : countries) {
            listOfCountriesAsStrings.add(country.toString());
        }
    }

    public int listSize() {
        return countries.size();
    }

    public boolean searchCountry(String name) {

        boolean check = false;

        for (Country country : countries) {

            if (country.getName().equalsIgnoreCase(name)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }

    public void removeCountry(String name) {
        Iterator<Country> iterator = countries.iterator();
        
        while (iterator.hasNext()) {
            Country country = iterator.next();
            if (country.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                break;
            }
        }
        updateListOfCountriesAsStrings();
    }   
}