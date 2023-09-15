/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sumdu.edu.ua.java_employeepract;

/**
 *
 * @author Oleksii
 */
public class Java_EmployeePract {

    public static void main(String[] args)  {
      try {
            // Спроба створити співробітника з коректними даними
            Employee employee1 = new Employee("John", "Doe", 50000.0);
            System.out.println("Employee 1 created: " + employee1.getName() + " " + employee1.getSurname());

        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.err.println("Exception during employee creation: " + e.getMessage());
        }

        try {
            // Спроба створити співробітника з некоректною назвою (забагато символів)
            Employee employee2 = new Employee("ThisIsAReallyLongNameThatExceedsTheLimit", "Doe", 60000.0);
            System.out.println("Employee 2 created: " + employee2.getName() + " " + employee2.getSurname());
        } catch (FieldLengthLimitException e) {
            System.err.println("Field Length Limit Exception: " + e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.err.println("Incorrect Salary Exception: " + e.getMessage());
        }
    }
}
