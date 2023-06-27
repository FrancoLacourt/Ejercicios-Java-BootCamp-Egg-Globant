
package Entity;


public class Rectangle {
    
    private int base;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
    
    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", height=" + height + '}';
    }   
}
