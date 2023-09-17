
package Entities;

public class ServiceStaff extends Employee {
    
    private String section;

    public ServiceStaff() {
    }

    public ServiceStaff(String section, int yearOfEmployment, int officeNumber, String name, String lastName, int id, String maritalStatus) {
        super(yearOfEmployment, officeNumber, name, lastName, id, maritalStatus);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Service Staff. Name: " + name + ". Last name: " + lastName + ". ID: " + id + ". Marital Status: " + maritalStatus +". Section: " + section + ".";
    }
    
    
    
}
