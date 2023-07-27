package Services;

import Entities.Dog;
import java.util.ArrayList;

public class DogService {

    private ArrayList<Dog> dogs = new ArrayList();
    private ArrayList<String> listOfDogsAsStrings = new ArrayList();

    public Dog createDog(String breed) {

        return new Dog(breed);
    }

    public void addDogToTheList(Dog dog) {

        dogs.add(dog);
        updateListOfDogsAsStrings();

    }

    public void createAndAdd(String breed) {
        Dog dog = createDog(breed);
        addDogToTheList(dog);
    }

    public ArrayList<String> getListOfDogsAsStrings() {
        return listOfDogsAsStrings;
    }

    public int listSize() {
        return dogs.size();
    }

    public boolean searchBreed(String dogBreed) {
        
        boolean check = false;

        for (Dog dog : dogs) {

            if (dog.getBreed().equalsIgnoreCase(dogBreed)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
    
    public void removeBreed(String dogBreed) {
        
        for (int i = 0; i < dogs.size(); i++) {
            Dog dog = dogs.get(i);
            
            if (dog.getBreed().equalsIgnoreCase(dogBreed)) {
                dogs.remove(i);
            }
        }
        updateListOfDogsAsStrings();
    }
    
    public void updateListOfDogsAsStrings() {
        listOfDogsAsStrings.clear();
        
        for (Dog dog : dogs) {
            listOfDogsAsStrings.add(dog.toString());
        }       
    }
}