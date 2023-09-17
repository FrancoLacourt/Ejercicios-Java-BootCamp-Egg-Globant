
package Entities;

public class Student extends University{
    
    private String course;

    public Student() {
    }

    public Student(String course, String name, String lastName, int id, String maritalStatus) {
        super(name, lastName, id, maritalStatus);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    @Override
    public String toString() {
        return "Service Staff. Name: " + name + ". Last name: " + lastName + ". ID: " + id + ". Marital Status: " + maritalStatus +". Course: " + course + ".";
    }
    
}
