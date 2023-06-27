
package Entity;

public class Person {
    
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private int belowIdealWeight;
    private int IdealWeight;
    private int aboveIdealWeight;
    private int legalAgePerson;
    
    public Person() {
        this.legalAgePerson = 0;
        this.aboveIdealWeight = 0;
        this.IdealWeight = 0;
        this.belowIdealWeight = 0;
    }

    public Person(String name, int age, String gender, double weight, double height) {
        this.legalAgePerson = 0;
        this.aboveIdealWeight = 0;
        this.IdealWeight = 0;
        this.belowIdealWeight = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    
    //Getters:
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getBelowIdealWeight() {
        return belowIdealWeight;
    }

    public int getIdealWeight() {
        return IdealWeight;
    }

    public int getAboveIdealWeight() {
        return aboveIdealWeight;
    }

    public int getLegalAgePerson() {
        return legalAgePerson;
    }
   
    //Setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBelowIdealWeight(int belowIdealWeight) {
        this.belowIdealWeight = belowIdealWeight;
    }

    public void setIdealWeight(int IdealWeight) {
        this.IdealWeight = IdealWeight;
    }

    public void setAboveIdealWeight(int aboveIdealWeight) {
        this.aboveIdealWeight = aboveIdealWeight;
    }

    public void setLegalAgePerson(int legalAgePerson) {
        this.legalAgePerson = legalAgePerson;
    }
}