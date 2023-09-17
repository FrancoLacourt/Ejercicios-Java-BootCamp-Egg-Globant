/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package extra04inheritance;

import Entities.Employee;
import Entities.Professor;
import Entities.ServiceStaff;
import Entities.Student;
import Entities.University;
import Services.Enumerations.Course;
import Services.Enumerations.Department;
import Services.Enumerations.Section;
import Services.UniversityService;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Extra04Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String name;
        String lastName;
        String maritalStatus;
        String newMaritalStatus;
        String role;
        String course;
        String newCourse;
        String department;
        String newDepartment;
        String section;
        String newSection;
        int id;
        int yearOfEmployment;
        int counter;
        Integer oldOfficeNumber;
        Integer officeNumber;
        Integer newOfficeNumber;
        boolean check;

        UniversityService us = new UniversityService();

        Course[] courses = Course.values();
        Department[] departments = Department.values();
        Section[] sections = Section.values();

        ArrayList<University> people = new ArrayList();
        ArrayList<Integer> offices = new ArrayList();

        while (!exit) {
            System.out.println("1. Add person.");
            System.out.println("2. Show all people.");
            System.out.println("3. Change the office of an employee.");
            System.out.println("4. Change the course of a student.");
            System.out.println("5. Change the department of a professor.");
            System.out.println("6. Change the section of someone in the service staff.");
            System.out.println("7. Exit");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:

                    System.out.println("Please enter the name of the person.");
                    name = sc.nextLine();

                    System.out.println("Enter last name.");
                    lastName = sc.nextLine();

                    System.out.println("Enter ID.");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter marital status. (Single/Married).");
                    maritalStatus = sc.nextLine();

                    while (!maritalStatus.equalsIgnoreCase("Single") && !maritalStatus.equalsIgnoreCase("Married")) {
                        System.out.println("Error. Please answer with Single/Married.");
                        maritalStatus = sc.nextLine();
                    }

                    System.out.println("What is the role of the person you are trying to add? (Student, Professor, Service staff).");
                    role = sc.nextLine();

                    while (!role.equalsIgnoreCase("Student") && !role.equalsIgnoreCase("Employee")) {
                        System.out.println("Error. Please answer with (Student, Employee).");
                        role = sc.nextLine();
                    }

                    if (role.equalsIgnoreCase("Student")) {

                        System.out.println("Enter the course you want to enroll the student in.");
                        course = sc.nextLine();

                        while (!us.checkCourses(course)) {
                            System.out.println("The entered course is not part of this university. You need to enroll to another course.");
                            course = sc.nextLine();
                        }

                        Student s = us.createStudent(course, name, lastName, id, maritalStatus);

                        people.add(s);
                        System.out.println("The student was succesfully added.");
                    } else {

                        System.out.println("Enter year of employment of the employee.");
                        yearOfEmployment = sc.nextInt();

                        System.out.println("Enter the office number of the employee.");
                        officeNumber = sc.nextInt();

                        for (Integer office : offices) {
                            while (Objects.equals(officeNumber, office)) {
                                System.out.println("Sorry. There is already someone on that office. You must select a different office.");
                                officeNumber = sc.nextInt();
                            }
                        }

                        sc.nextLine();

                        offices.add(officeNumber);

                        if (role.equalsIgnoreCase("Professor")) {

                            System.out.println("Enter professor's department");
                            department = sc.nextLine();

                            while (!us.checkDepartment(department)) {
                                System.out.println("The entered department is not part of this university. You need to select another department.");
                                department = sc.nextLine();
                            }

                            Professor p = us.createProfessor(department, yearOfEmployment, officeNumber, name, lastName, id, maritalStatus);

                            people.add(p);
                            System.out.println("The professor was succesfully added.");
                        } else {

                            System.out.println("Enter service staff's section.");
                            section = sc.nextLine();

                            while (!us.checkSection(section)) {
                                System.out.println("The entered sectoin is not part of this university. You need to select another section.");
                                section = sc.nextLine();
                            }

                            ServiceStaff ss = us.createServiceStaff(section, yearOfEmployment, officeNumber, name, lastName, id, maritalStatus);

                            people.add(ss);
                            System.out.println("The person in service staff was succesfully added.");
                        }
                    }

                    System.out.println("");
                    break;

                case 2:

                    for (University person : people) {
                        System.out.println(person.toString());
                        System.out.println("");
                    }

                    System.out.println("");
                    break;

                case 3:
                    counter = 0;
                    oldOfficeNumber = 0;
                    check = false;

                    System.out.println("Enter the ID of the employee who whants to change to another office");
                    id = sc.nextInt();
                    sc.nextLine();

                    for (University person : people) {
                        counter += 1;
                        if (id == person.getId()) {
                            if (person instanceof Employee) {
                                Employee object = (Employee) person;
                                oldOfficeNumber = ((Employee) person).getOfficeNumber();
                                check = true;
                                break;
                            } else {
                                System.out.println("There is no employee with this id.");
                            }
                        }
                    }

                    if (!check) {
                        break;
                    }

                    System.out.println("Enter the number of the new Office.");
                    newOfficeNumber = sc.nextInt();

                    for (Integer office : offices) {
                        while (Objects.equals(newOfficeNumber, office)) {
                            System.out.println("Sorry. There is already someone on that office. You must select a different office.");
                            newOfficeNumber = sc.nextInt();
                        }
                    }
                    sc.nextLine();

                    for (int i = 0; i < offices.size(); i++) {
                        if (Objects.equals(offices.get(i), oldOfficeNumber)) {
                            offices.remove(i);
                        }
                    }

                    us.changeEmployeeOfficeNumber(people, counter, newOfficeNumber);

                    System.out.println("");
                    break;

                case 4:
                    counter = 0;
                    check = false;

                    System.out.println("Enter the ID of the student who whants to change to another course");
                    id = sc.nextInt();
                    sc.nextLine();

                    for (University person : people) {
                        counter += 1;
                        if (id == person.getId()) {
                            if (person instanceof Student) {
                                check = true;
                                break;
                            } else {
                                System.out.println("There is no student with this id.");
                            }
                        }
                    }

                    if (!check) {
                        break;
                    }

                    System.out.println("Enter the new course of the student.");
                    newCourse = sc.nextLine();

                    while (!us.checkCourses(newCourse)) {
                        System.out.println("The entered course is not part of this university. You need to enroll to another course.");
                        newCourse = sc.nextLine();
                    }

                    us.changeStudentCourse(people, counter, newCourse);

                    System.out.println("");
                    break;

                case 5:
                    counter = 0;
                    check = false;

                    System.out.println("Enter the ID of the professor who wants to change to another department.");
                    id = sc.nextInt();
                    sc.nextLine();

                    for (University person : people) {
                        counter += 1;
                        if (id == person.getId()) {
                            if (person instanceof Professor) {
                                check = true;
                                break;
                            } else {
                                System.out.println("There is no professor with this id.");
                            }
                        }
                    }

                    if (!check) {
                        break;
                    }

                    System.out.println("Enter the new department of the professor");
                    newDepartment = sc.nextLine();

                    while (!us.checkDepartment(newDepartment)) {
                        System.out.println("The entered department is not part of this university. You need to select another department.");
                        newDepartment = sc.nextLine();
                    }
                    
                    us.changeProfessorDepartment(people, counter, newDepartment);

                    System.out.println("");
                    break;

                case 6:
                    counter = 0;
                    check = false;
                    
                    System.out.println("Enter the ID of the person in the service staff who wants to change to another section.");
                    id = sc.nextInt();
                    sc.nextLine();
                    
                    for (University person : people) {
                        counter += 1;
                        if (id == person.getId()) {
                            if (person instanceof ServiceStaff) {
                                check = true;
                                break;
                            } else {
                                System.out.println("There is no person in the service staff with this id.");
                            }
                        }
                    }
                    
                    if (!check) {
                        break;
                    }
                    
                    System.out.println("Enter the new section of the person in the service staff.");
                    newSection = sc.nextLine();
                    
                    while (!us.checkSection(newSection)) {
                                System.out.println("The entered sectoin is not part of this university. You need to select another section.");
                                newSection = sc.nextLine();
                            }
                    
                    us.changeServiceStaffSection(people, counter, newSection);
                    
                    System.out.println("");
                    break;

                case 7:
                    System.out.println("Exiting the menu...");
                    exit = true;
                    break;
                default:
                    System.out.println("Error. You must choose a valid option.");
                    System.out.println("");
            }
        }
    }
}