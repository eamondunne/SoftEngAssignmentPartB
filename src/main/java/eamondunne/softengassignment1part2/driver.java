/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamondunne.softengassignment1part2;

import eamondunne.softengassignment1.*;
import org.joda.time.DateTime;

/**
 *
 * @author eamondunne1
 */
public class driver {

    public static void main(String[] args) {
        /* Mock some Joda DateTime Objects to use as sample birthdays */
        DateTime Date1 = new DateTime(0);
        DateTime Date2 = new DateTime(315532800);
        DateTime Date3 = new DateTime(631152000);
        DateTime Date4 = new DateTime(946684800);

        /* Student Data */
        Student student1 = new Student("Patrick", 10203040, Date1);
        Student student2 = new Student("PJ", 11213141, Date2);
        Student student3 = new Student("Patricia", 12345678, Date3);
        Student student4 = new Student("Frank", 87654321, Date4);
        Student student5 = new Student("Hank", 11122334, Date1);

        /* Modules */
        Module module1 = new Module("Software Engineering III", "CT417");
        Module module2 = new Module("Machine Learning & Data Mining", "CT475");
        Module module3 = new Module("Artificial Intelligence", "CT431");
        Module module4 = new Module("Geography II", "GE101");
        Module module5 = new Module("Creative Writing", "EN302");

        /* DateTimes of course Start & End Dates */
        DateTime startDate = new DateTime(2017, 9, 1, 0, 0);
        DateTime endDate = new DateTime(2018, 4, 30, 0, 0);

        /* Courses */
        Course course1 = new Course("Computer Science & IT", startDate, endDate);
        Course course2 = new Course("Arts", startDate, endDate);

        /*Add Students to Modules */
        module1.addStudent(student1);
        module1.addStudent(student2);
        module2.addStudent(student1);
        module2.addStudent(student2);
        module3.addStudent(student2);
        module3.addStudent(student3);
        module4.addStudent(student4);
        module4.addStudent(student5);
        module5.addStudent(student4);
        module5.addStudent(student5);
        
        /*Add Modules to Courses */
        course1.addModule(module1);
        course1.addModule(module2);
        course1.addModule(module3);
        course2.addModule(module4);
        course2.addModule(module5);
        
        System.out.println("Printing Course Details: \n");
        System.out.println("Course Name: " + course1.getCourseName() + "\nAvailable Modules:");
        course1.printModuleList();
        System.out.println("------------------");
        course1.printStudentDetails();
        System.out.println("Course Name: " + course2.getCourseName() + "\nAvailable Modules:");
        course2.printModuleList();
        System.out.println("------------------");
        course2.printStudentDetails();
    }
}
