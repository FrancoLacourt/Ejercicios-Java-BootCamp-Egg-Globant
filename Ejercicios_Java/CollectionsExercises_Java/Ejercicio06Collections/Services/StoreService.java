package Services;

import Entities.Store;
import java.util.HashMap;
import java.util.Map;

public class StoreService {

    private HashMap<String, Double> products = new HashMap();

    public Store createProduct(String name, Double price) {
        return new Store(name, price);
    }

    public void addProductToTheMap(Store product) {
        products.put(product.getName(), product.getPrice());
    }

    public void createAndAdd(String name, Double price) {
        Store product = createProduct(name, price);
        addProductToTheMap(product);
    }

    public int mapSize() {
        return products.size();
    }

    public boolean searchProduct(String name) {

        boolean check = false;

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (key.equalsIgnoreCase(name)) {
                check = true;
                break;
            } else {
                check = false;
            }

        }
        return check;
    }
    
    public void changeProductPrice(String name, double price) {
        products.put(name, price);
    }
    
    public void removeProduct(String name) {
        products.remove(name);
    }
    
    public HashMap<String, Double> getAllProducts() {
        return products;
    }
}