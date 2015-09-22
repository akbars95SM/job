package com.mtsmda.java.simple.comparatorI;

/**
 * Created by MTSMDA on 22.09.2015.
 */
public class Student {

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

}