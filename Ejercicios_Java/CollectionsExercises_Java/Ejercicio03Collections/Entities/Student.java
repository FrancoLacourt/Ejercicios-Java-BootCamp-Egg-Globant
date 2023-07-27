
package Entities;

import java.util.ArrayList;


public class Student {
    
    private String name;
    private ArrayList<Integer> grades = new ArrayList();

    public Student() {
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Nombre= " + name + ", Notas= " + grades;
    }   
}