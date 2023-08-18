package Services;

import Entities.Game;
import Entities.Player;
import Entities.WaterRevolver;
import java.util.ArrayList;
import java.util.Random;

public class GameService {

    Game g = new Game();
    
    RevolverService rs = new RevolverService();
    PlayerService ps = new PlayerService();
    
    

    public void fillGame(WaterRevolver r, PlayerService ps) {
        ArrayList<Player> players = ps.getListOfPlayers();
        g.setPlayers(players);
        g.setR(r);
    }

    public void startGame(int i) {
        ArrayList<Player> players = g.getPlayers();
        
        if (rs.getWet(g.getR())) {
            players.get(i).setWet(true);
        } else {
            rs.nextPosition(g.getR());
        }
    }
}