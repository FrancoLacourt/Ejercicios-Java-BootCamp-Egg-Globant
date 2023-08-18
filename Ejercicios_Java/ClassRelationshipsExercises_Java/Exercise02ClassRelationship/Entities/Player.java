
package Entities;

public class Player {
    
    private int id;
    private String name;
    private boolean wet;

    public Player() {
    }
    
    public Player(int id, String name, boolean wet) {
        this.id = id;
        this.name = name;
        this.wet = wet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }
}