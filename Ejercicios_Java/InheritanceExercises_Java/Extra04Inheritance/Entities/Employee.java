
package Entities;

public class Employee extends University{
    
    protected int yearOfEmployment;
    protected int officeNumber;

    public Employee() {
    }

    public Employee(int yearOfEmployment, int officeNumber, String name, String lastName, int id, String maritalStatus) {
        super(name, lastName, id, maritalStatus);
        this.yearOfEmployment = yearOfEmployment;
        this.officeNumber = officeNumber;
    }
    

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
    
    
    
}
