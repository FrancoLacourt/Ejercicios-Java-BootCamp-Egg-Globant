
package Entities;

public class Person {
    
    private String name;
    private String lastName;
    private int age;
    private String id;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastName, int age, String id) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        String dogInfo = (dog != null) ? dog.toString() : "No dog assigned.";
        return "Name: " + name + ". Last name: " + lastName + ". Age: " + age + ". ID: " + id + ".\n Dog " + dogInfo + ".\n";
    }  
}