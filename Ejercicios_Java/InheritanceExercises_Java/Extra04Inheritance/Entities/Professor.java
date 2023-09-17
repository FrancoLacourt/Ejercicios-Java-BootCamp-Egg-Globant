
package Entities;

public class Professor extends Employee{
    
    private String department;

    public Professor() {
    }

    public Professor(String department, int yearOfEmployment, int officeNumber, String name, String lastName, int id, String maritalStatus) {
        super(yearOfEmployment, officeNumber, name, lastName, id, maritalStatus);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Professor. Name: " + name + ". Last name: " + lastName + ". ID: " + id + ". Marital Status: " + maritalStatus +". Department: " + department + ".";
    }
    
}
