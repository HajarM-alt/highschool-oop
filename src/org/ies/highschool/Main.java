package org.ies.highschool;

import org.ies.highschool.components.StudentReader;
import org.ies.highschool.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        StudentReader studentReader = new StudentReader();

        System.out.println("----- Información del estudiante -----");
        Student student = studentReader.read();

        student.info();
    }
}
