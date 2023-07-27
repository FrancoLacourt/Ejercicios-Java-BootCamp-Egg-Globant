package Services;

import Entities.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList();
    private ArrayList<Integer> grades = new ArrayList();
    private ArrayList<String> listOfStudentsAsStrings = new ArrayList();

    public Student createStudent(String name, ArrayList<Integer> studentGrades) {

        return new Student(name, studentGrades);
    }

    public void addStudentToTheList(Student student) {

        students.add(student);
        updateListOfStudentsAsStrings();

    }

    public void createAndAdd(String name, ArrayList<Integer> studentGrades) {
        Student student = createStudent(name, studentGrades);
        addStudentToTheList(student);
    }

    public ArrayList<String> getListOfStudentsAsStrings() {
        return listOfStudentsAsStrings;
    }

    public void updateListOfStudentsAsStrings() {
        listOfStudentsAsStrings.clear();
        for (Student student : students) {
            listOfStudentsAsStrings.add(student.toString());
        }
    }

    public int listSize() {
        return students.size();
    }

    public boolean searchStudent(String name) {

        boolean check = false;

        for (Student student : students) {

            if (student.getName().equalsIgnoreCase(name)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }

        }
        return null;
    }

    public double getFinalGrade(String name) {

        if (searchStudent(name)) {
            int sum = 0;
            Student targetStudent = findStudentByName(name);
            for (int grade : targetStudent.getGrades()) {
                sum += grade;
            }
            
            int totalGrades = targetStudent.getGrades().size();
            double finalGrade = ((double)sum/(double)totalGrades);
            
            return finalGrade;
            
        } else {
            return 0;
        }
    }
}