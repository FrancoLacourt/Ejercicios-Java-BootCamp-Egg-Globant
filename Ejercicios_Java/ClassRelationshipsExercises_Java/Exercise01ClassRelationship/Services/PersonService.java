package Services;

import Entities.Dog;
import Entities.Person;
import java.util.ArrayList;
import java.util.HashSet;

public class PersonService {

    private ArrayList<Person> persons = new ArrayList();
    private ArrayList<String> listOfPersonsWithDog = new ArrayList();    
    

    public Person createPerson(String name, String lastName, int age, String id) {
        return new Person(name, lastName, age, id);
    }

    public void addPersonToTheList(Person person) {
        persons.add(person);
        updateListOfPersonsWithDog();
    }

    public void createAndAdd(String name, String lastName, int age, String id) {
        Person person = createPerson(name, lastName, age, id);
        addPersonToTheList(person);
    }

    public ArrayList<String> getListOfPersonsWithDog() {
        return listOfPersonsWithDog;
    }
    
    public ArrayList<Person> getListOfPersons() {
        return persons;
    }

    public void updateListOfPersonsWithDog() {
        listOfPersonsWithDog.clear();
        for (Person person : persons) {
            if (person.getDog()!= null) {
                listOfPersonsWithDog.add(person.toString());
            }
        }
    }

    public int listSize() {
        return persons.size();
    }
    
    public void setDog(DogService ds, String breed, int person) {
        HashSet<Dog> listOfDogs = ds.getListOfDogs();
        for (Dog dog : listOfDogs) {
            if (dog.getBreed().getValue().equalsIgnoreCase(breed)) {
                persons.get(person).setDog(dog);
                break;
            }
        }
        updateListOfPersonsWithDog();
    }
}