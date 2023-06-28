
package Entity;

import java.util.Date;


public class Person {
    
    private String name;
    private Date birthdate;
    private int currentAge;

    public Person() {
    }

    public Person(String name, Date birthdate, int currentAge) {
        this.name = name;
        this.birthdate = birthdate;
        this.currentAge = currentAge;
    }

    

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getCurrentAge() {
        return currentAge;
    }
    

    
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }  
}