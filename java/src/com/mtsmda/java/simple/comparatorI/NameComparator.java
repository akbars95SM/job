package com.mtsmda.java.simple.comparatorI;

import java.util.Comparator;

/**
 * Created by MTSMDA on 22.09.2015.
 */
public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}