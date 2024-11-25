package org.ies.highschool.model;

import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private String address;


    public Student(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }


    public void info() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + name);
        System.out.println("Apellidos: " + surname);
        System.out.println("Dirección: " + address);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
