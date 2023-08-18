
package Entities;

import java.util.ArrayList;

public class Game {
    
    private WaterRevolver r;
    private ArrayList<Player> players;

    public Game() {
    }

    public Game(WaterRevolver r, ArrayList<Player> players) {
        this.r = r;
        this.players = players;
    }

    public WaterRevolver getR() {
        return r;
    }

    public void setR(WaterRevolver r) {
        this.r = r;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }   
}