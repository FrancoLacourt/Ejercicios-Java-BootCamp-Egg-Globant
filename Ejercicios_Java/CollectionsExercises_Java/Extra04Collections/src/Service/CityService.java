
package Service;

import Entities.City;
import java.util.HashMap;
import java.util.Map;

public class CityService {
    
    private HashMap<String, String> cities = new HashMap();
    
    public City createCity(String postalCode, String name) {
        return new City(postalCode, name);
    }
    
    public void addCityToTheList(City city) {
        cities.put(city.getPostalCode(), city.getName());
    }
    
    public void createAndAdd(String postalCode, String name) {
        City city = createCity(postalCode, name);
        addCityToTheList(city);
    }
    
    public int mapSize() {
        return cities.size();
    }
    
    public boolean searchCityByPostalCode(String postalCode) {

        boolean check = false;

        for (Map.Entry<String, String> entry : cities.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equalsIgnoreCase(postalCode)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
    
    public boolean searchCityByName(String name) {

        boolean check = false;

        for (Map.Entry<String, String> entry : cities.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equalsIgnoreCase(name)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
    
    public String getCityName(String postalCode) {
        for (Map.Entry<String, String> entry : cities.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equalsIgnoreCase(postalCode)) {
                return value;
            }
            
        }
        return null;
    }
    
    public void removeCity(String name) {
        for (Map.Entry<String, String> entry : cities.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equalsIgnoreCase(name)) {
                cities.remove(key);
                break;
            }
        }
    }
    
    public HashMap<String, String> getAllCities() {
        return cities;
    }   
}