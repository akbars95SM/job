package com.mtsmda.java.simple.comparatorI;

import java.util.Comparator;

/**
 * Created by MTSMDA on 22.09.2015.
 */
public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() > student2.getAge()) {
            return 1;
        } else if (student1.getAge() < student2.getAge()) {
            return -1;
        }
        return 0;
    }
}