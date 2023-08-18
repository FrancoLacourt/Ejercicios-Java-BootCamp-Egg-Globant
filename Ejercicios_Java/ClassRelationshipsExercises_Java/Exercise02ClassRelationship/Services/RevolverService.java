package Services;

import Entities.WaterRevolver;
import java.util.Random;

public class RevolverService {

    Random random = new Random();

    public void loadRevolver(WaterRevolver r) {
        int currentPosition = random.nextInt(6) + 1;
        int waterPosition = random.nextInt(6) + 1;

        r.setCurrentPosition(currentPosition);
        r.setWaterPosition(waterPosition);
    }

    public boolean getWet(WaterRevolver r) {
        return r.getCurrentPosition() == r.getWaterPosition();
    }

    public void nextPosition(WaterRevolver r) {
        int currentPosition = r.getCurrentPosition();

        if (currentPosition >= 6) {
            r.setCurrentPosition(1);
        } else {
            if (currentPosition < 6) {
                r.setCurrentPosition(currentPosition + 1);
            }
        }
    }

    public String revolverInfo(WaterRevolver r) {
        return r.toString();
    }
}