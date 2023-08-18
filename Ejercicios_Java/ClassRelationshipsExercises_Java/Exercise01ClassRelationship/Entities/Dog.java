
package Entities;

import exercise01classrelationship.Enumerations.Breed;
import exercise01classrelationship.Enumerations.Size;
import java.util.Objects;

public class Dog {
    
    private String name;
    private Breed breed;
    private int age;
    private Size size;

    public Dog() {
    }

    public Dog(Breed breed, int age, Size size) {
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.breed);
        hash = 37 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.breed != other.breed) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String nameInfo = (name != null) ? name : "No";
        return "Name: " + nameInfo + ". Breed: " + breed.getValue() + ". Age: " + age + ". Size: " + size.getValue();
    }
}