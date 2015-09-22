package com.mtsmda.java.simple.comparableI;

import java.util.*;

/**
 * Created by MTSMDA on 22.09.2015.
 */
public class ComparableInter {

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

        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("after");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Simple Set");

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);

        Iterator<Student> studentIterator = studentSet.iterator();
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
        System.out.println("Simple TreeSet");
        Set<Student> studentSetT = new TreeSet<>();
        studentSetT.add(student1);
        studentSetT.add(student2);
        studentSetT.add(student3);
        studentSetT.add(student4);
        studentSetT.add(student5);

        Iterator<Student> studentIteratorT = studentSetT.iterator();
        while(studentIteratorT.hasNext()){
            System.out.println(studentIteratorT.next());
        }

    }

}

class Student implements Comparable<Student> {

    private Integer rollNo;
    private String name;
    private Integer age;

    public Student() {

    }

    public Student(Integer rollNo, String name, Integer age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.getAge()) {
            return 1;
        } else if (this.age < o.getAge()) {
            return -1;
        }
        return 0;
    }
}