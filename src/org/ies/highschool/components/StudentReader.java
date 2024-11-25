package org.ies.highschool.components;

import org.ies.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    public Student read() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del estudiante:");
        String name = scanner.nextLine();

        System.out.println("Introduce los apellidos del estudiante:");
        String surname = scanner.nextLine();

        System.out.println("Introduce la dirección del estudiante:");
        String address = scanner.nextLine();

        return new Student(name, surname, address);
    }
}
