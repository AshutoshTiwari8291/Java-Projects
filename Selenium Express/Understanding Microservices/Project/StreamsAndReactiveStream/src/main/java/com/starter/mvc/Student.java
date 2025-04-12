package com.starter.mvc;

public class Student {
    private int id;
    private String studentName;
    private long mobileNumber;
    private int age;

    public Student(int id, String studentName, long mobileNumber, int age) {
        this.id = id;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                '}';
    }
}
