
package Entity;


public class CoffeMaker {
    
    private int maxCapacity;
    private int currentAmount;

    public CoffeMaker() {
    }

    public CoffeMaker(int maxCapacity, int currentAmount) {
        this.maxCapacity = maxCapacity;
        this.currentAmount = currentAmount;
    }

    //Getters
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    //Setters
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }
    
    
    
    
    
}
