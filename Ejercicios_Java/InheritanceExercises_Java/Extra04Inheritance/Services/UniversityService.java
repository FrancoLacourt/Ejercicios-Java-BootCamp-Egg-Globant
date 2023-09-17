package Services;

import Entities.Employee;
import Entities.Professor;
import Entities.ServiceStaff;
import Entities.Student;
import Entities.University;
import Services.Enumerations.Course;
import Services.Enumerations.Department;
import Services.Enumerations.Section;
import java.util.ArrayList;

public class UniversityService {

    Course[] courses = Course.values();
    Department[] departments = Department.values();
    Section[] sections = Section.values();

    public Student createStudent(String course, String name, String lastName, int id, String maritalStatus) {

        Student s = new Student(course, name, lastName, id, maritalStatus);

        return s;
    }

    public Professor createProfessor(String department, int yearOfEmployment, int officeNumber, String name, String lastName, int id, String maritalStatus) {

        Professor p = new Professor(department, yearOfEmployment, officeNumber, name, lastName, id, maritalStatus);

        return p;
    }

    public ServiceStaff createServiceStaff(String section, int yearOfEmployment, int officeNumber, String name, String lastName, int id, String maritalStatus) {

        ServiceStaff ss = new ServiceStaff(section, yearOfEmployment, officeNumber, name, lastName, id, maritalStatus);

        return ss;
    }

    public void changeMaritalStatus(ArrayList<University> people, int personIndex, String newMaritalStatus) {

        University person = people.get(personIndex);

        person.setMaritalStatus(newMaritalStatus);
    }

    public void changeEmployeeOfficeNumber(ArrayList<University> people, int personIndex, int newOfficeNumber) {
        University person = people.get(personIndex);

        if (person instanceof Employee) {
            Employee object = (Employee) person;
            ((Employee) person).setOfficeNumber(newOfficeNumber);
        }
    }

    public void changeStudentCourse(ArrayList<University> people, int personIndex, String newCourse) {
        University person = people.get(personIndex);

        if (person instanceof Student) {
            Student object = (Student) person;
            ((Student) person).setCourse(newCourse);
        }
    }

    public void changeProfessorDepartment(ArrayList<University> people, int personIndex, String newDepartment) {
        University person = people.get(personIndex);

        if (person instanceof Professor) {
            Professor object = (Professor) person;
            ((Professor) person).setDepartment(newDepartment);
        }
    }

    public void changeServiceStaffSection(ArrayList<University> people, int personIndex, String newSection) {
        University person = people.get(personIndex);

        if (person instanceof ServiceStaff) {
            ServiceStaff object = (ServiceStaff) person;
            ((ServiceStaff) person).setSection(newSection);
        }
    }

    public boolean checkCourses(String course) {

        for (int i = 0; i < 7; i++) {
            if (course.equalsIgnoreCase(courses[i].getValue())) {

                return true;
            }
        }
        return false;
    }

    public boolean checkDepartment(String department) {
        for (int i = 0; i < 7; i++) {
            if (department.equalsIgnoreCase(departments[i].getValue())) {

                return true;
            }
        }
        return false;
    }

    public boolean checkSection(String section) {
        for (int i = 0; i < 7; i++) {
            if (section.equalsIgnoreCase(sections[i].getValue())) {

                return true;
            }
        }
        return false;
    }

}
