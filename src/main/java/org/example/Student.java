package org.example;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class Student {

    String name;
    int age;
    double height;

// Das ist eine Konstruktor
    public Student(String name, int age, double height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }
}
