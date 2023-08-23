
package Services;

import Entities.Viewer;
import java.util.Random;

public class ViewerService {
    
    Random random = new Random();
    
    public Viewer createViewer(String name, int age, double availableMoney) {
        return new Viewer(name, age, availableMoney);
    }
}