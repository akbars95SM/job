package com.mtsmda.java.simple.comparatorI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by MTSMDA on 22.09.2015.
 */
public class ComparatorInter {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Ivan", 25);
        Student student2 = new Student(2, "Petr", 35);
        Student student3 = new Student(3, "Iasha", 75);
        Student student4 = new Student(4, "Iosif", 15);
        Student student5 = new Student(5, "Grigorii", 36);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("before");
        System.out.println(students);
        System.out.println();

        Collections.sort(students, new AgeComparator());
        System.out.println("after age comparator");
        System.out.println(students);
        System.out.println();

        Collections.sort(students, new NameComparator());
        System.out.println("after name comparator");
        System.out.println(students);
        System.out.println();
    }

}