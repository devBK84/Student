package org.example;

import java.util.ArrayList;
import java.util.List;

// Lege eine Klasse Student an und überlege dir drei Eigenschaften
// Schreibe Methoden, um die Eigenschaften zu setzen und abzufragen
public class Main {
    public static void main(String[] args) {
// Das ist eine Instanz mit dem namen Studentlist

        Student student1 = new Student("Alf", 23, 1.98);

//        student1.Age = 21;
//        student1.Height = 1.98;
//        student1.Name = "Alf";

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);

        System.out.println(student1.age);
        System.out.println(student1.height);
        System.out.println(student1.name);

    }
  // Verschiebe deine Student Klasse in ein model Package und passe die Sichtbarkeiten und Referenzen an
    // Schreibe eine Methode toString welche alle Eigenschaften eines Studenten als String zurückgibt
    //Schreibe für deinen Student Klasse einen Konstruktor und verwende ihn
}