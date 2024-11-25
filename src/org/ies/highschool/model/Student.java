package org.ies.highschool.model;

public class Student {
    // Campos
    private String name;
    private String surname;
    private String address;

    // Constructor
    public Student(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    // Método info
    public void info() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + name);
        System.out.println("Apellidos: " + surname);
        System.out.println("Dirección: " + address);
    }
}
