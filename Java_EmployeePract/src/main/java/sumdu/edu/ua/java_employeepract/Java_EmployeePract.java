/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package sumdu.edu.ua.java_employeepract;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oleksii
 */
public class Java_EmployeePract {

    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("Taras", "Shevchenko", 1345);
            emp1.PrintEmployeeId();
            System.out.println("Name - " + emp1.getName());
            System.out.println("Surname - " + emp1.getSurname());
            System.out.println("Salary - " + emp1.getSalary());

        } catch (FieldLengthLimitException ex) {
            System.out.println("Field Length Limit Exception: " + ex.getMessage());
        } catch (IncorrectSalaryException ex) {
            System.out.println("Incorrect Salary Exception:  " + ex.getMessage());
        }

        try {
            Employee emp2 = new Employee("Tarassssssssssssssssssssssssssssssss", "Shevchenko", 1345);
            emp2.PrintEmployeeId();
            System.out.println("Name - " + emp2.getName());
            System.out.println("Surname - " + emp2.getSurname());
            System.out.println("Salary - " + emp2.getSalary());

        } catch (FieldLengthLimitException ex) {
            System.out.println("Field Length Limit Exception: " + ex.getMessage());
        } catch (IncorrectSalaryException ex) {
            System.out.println("Incorrect Salary Exception:  " + ex.getMessage());
        }

        try {
            Employee emp3 = new Employee("Taras", "Shevchenko0000000000000000000000000000000", 1345);
            emp3.PrintEmployeeId();
            System.out.println("Name - " + emp3.getName());
            System.out.println("Surname - " + emp3.getSurname());
            System.out.println("Salary - " + emp3.getSalary());

        } catch (FieldLengthLimitException ex) {

            System.out.println("Field Length Limit Exception: " + ex.getMessage());
        } catch (IncorrectSalaryException ex) {
            System.out.println("Incorrect Salary Exception:  " + ex.getMessage());
        }

        try {
            Employee emp4 = new Employee("Taras", "Shevchenko", -1345);
            emp4.PrintEmployeeId();
            System.out.println("Name - " + emp4.getName());
            System.out.println("Surname - " + emp4.getSurname());
            System.out.println("Salary - " + emp4.getSalary());

        } catch (FieldLengthLimitException ex) {
            System.out.println("Field Length Limit Exception: " + ex.getMessage());
        } catch (IncorrectSalaryException ex) {
            System.out.println("Incorrect Salary Exception:  " + ex.getMessage());
        }

        try {
            Employee emp5 = new Employee("Taras", "Shevchenko", 1345);
            emp5.PrintEmployeeId();
            System.out.println("Name - " + emp5.getName());
            System.out.println("Surname - " + emp5.getSurname());
            System.out.println("Salary - " + emp5.getSalary());

        } catch (FieldLengthLimitException ex) {
            System.out.println("Field Length Limit Exception: " + ex.getMessage());
        } catch (IncorrectSalaryException ex) {
            System.out.println("Incorrect Salary Exception:  " + ex.getMessage());
        }

    }
}
