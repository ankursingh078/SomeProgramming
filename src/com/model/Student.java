package com.model;

import java.util.List;

public class Student {

    private Long rollNo;
    private String firstName;
    private String lastName;
    private String standard;
    private List<String> subjects;
    private Integer age;

    public Student() {
    }

    public Student(Long rollNo, String firstName, String lastName, String standard, List<String> subjects, Integer age) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.standard = standard;
        this.subjects = subjects;
        this.age = age;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", standard='" + standard + '\'' +
                ", subjects=" + subjects +
                ", age=" + age +
                '}';
    }
}
