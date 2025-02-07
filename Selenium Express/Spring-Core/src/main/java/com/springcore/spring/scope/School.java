package com.springcore.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract  class School {

    @Autowired
    private Student student; // Prototype

    @Lookup
    abstract  Student createStudent();

    public School() {
        System.out.println("School initiated");
    }

    public Student getStudent() {
        Student sc  =  createStudent();
        return sc;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
