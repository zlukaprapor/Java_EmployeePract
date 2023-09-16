/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package sumdu.edu.ua.java_employeepract;


/**
 *
 * @author Oleksii
 */
public class Java_EmployeePract {

    public static void main(String[] args) {
        try {
            Employee emp1;
            emp1 = new Employee("John", "Doe", 5000);
            emp1.PrintEmployeeId();
            System.out.println("Name - " + emp1.getName());
            System.out.println("Surname - " + emp1.getSurname());
            System.out.println("Salary - " + emp1.getSalary());

        } catch (FieldLengthLimitException ex) {
            System.out.println("Field Length Limit Exception: " + ex.getMessage());
        } catch (IncorrectSalaryException ex) {
            System.out.println("Incorrect Salary Exception:  " + ex.getMessage());
        }

       

    }
}
