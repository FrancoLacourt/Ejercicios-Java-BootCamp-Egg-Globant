package Services;

import Entities.Player;
import Entities.WaterRevolver;
import java.util.ArrayList;

public class PlayerService {

    RevolverService rs = new RevolverService();

    private ArrayList<Player> players = new ArrayList();

    public Player createPlayer(int id) {
        String name = "Player " + id;
        boolean wet = false;

        return new Player(id, name, wet);
    }

    public void addPlayerToTheList(Player player) {
        players.add(player);
    }

    public void createAndAdd(int count) {
        for (int i = 0; i < count; i++) {
            
            int id = players.size() + 1;

            Player player = createPlayer(id);
            addPlayerToTheList(player);
        }
    }

    public ArrayList<Player> getListOfPlayers() {
        return players;
    }    
}