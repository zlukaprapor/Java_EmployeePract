/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.java_employeepract;

/**
 *
 * @author Oleksii
 */
public final class Employee {

    private int id;
    private static int nextId = 1;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        setId();
        setName(name);
        setSurname(surname);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException {
        if (name.length() > 50) {
            throw new FieldLengthLimitException("Name lenght exceeds the limit");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws FieldLengthLimitException {
        if (surname.length() > 50) {
            throw new FieldLengthLimitException("Surname lenght exceeds the limit");
        }
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if (salary < 0) {
            throw new IncorrectSalaryException("Salary can't be negative");
        }
        this.salary = salary;
    }

}
