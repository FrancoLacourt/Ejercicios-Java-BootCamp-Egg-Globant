
package Entities;


public class Dog {
    
    private String breed;

    
    
    public Dog() {
    }
    
    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Breed= " + breed;
    }
}