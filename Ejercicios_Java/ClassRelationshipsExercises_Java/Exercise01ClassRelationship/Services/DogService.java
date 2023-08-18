package Services;

import Entities.Dog;
import exercise01classrelationship.Enumerations.Breed;
import exercise01classrelationship.Enumerations.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class DogService {

    private HashSet<Dog> dogs = new HashSet();
    private HashSet<Dog> availableDogs = new HashSet();
    private ArrayList<String> listOfAvailableDogsAsStrings = new ArrayList();
    Breed[] dogBreeds = Breed.values();
    Size[] dogSizes = Size.values();

    Random random = new Random();

    public Dog createDog() {
        Breed randomBreed = dogBreeds[random.nextInt(dogBreeds.length)];
        Size randomSize = dogSizes[random.nextInt(dogSizes.length)];
        int age = random.nextInt(15) + 1;
        return new Dog(randomBreed, age, randomSize);
    }

    public void addDogToTheList(Dog dog) {
        dogs.add(dog);
        availableDogs.add(dog);
        updateListOfAvailableDogsAsStrings();
    }

    public void createAndAdd() {
        Dog dog = createDog();
        addDogToTheList(dog);
    }

    public ArrayList<String> getListOfAvailableDogsAsStrings() {
        return listOfAvailableDogsAsStrings;
    }

    public HashSet<Dog> getListOfDogs() {
        return dogs;
    }

    public void updateListOfAvailableDogsAsStrings() {
        listOfAvailableDogsAsStrings.clear();
        for (Dog dog : availableDogs) {
            listOfAvailableDogsAsStrings.add(dog.toString());
        }
    }

    public int listSize() {
        return dogs.size();
    }

    public void setDogName(String breed, String name) {
        for (Dog dog : dogs) {
            if (dog.getBreed().getValue().equalsIgnoreCase(breed)) {
                dog.setName(name);
                break;
            }
        }
    }
    
    public void removeDog(String breed) {
        for (Dog dog : availableDogs) {
           if (dog.getBreed().getValue().equalsIgnoreCase(breed)) {
               availableDogs.remove(dog);
               updateListOfAvailableDogsAsStrings();
               break;
           } 
        }
    }

    public boolean searchDog(String breed) {

        boolean check = false;

        for (Dog dog : availableDogs) {

            if (dog.getBreed().getValue().equalsIgnoreCase(breed)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
}