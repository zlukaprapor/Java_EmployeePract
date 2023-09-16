
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sumdu.edu.ua.java_employeepract.Employee;
import sumdu.edu.ua.java_employeepract.FieldLengthLimitException;
import sumdu.edu.ua.java_employeepract.IncorrectSalaryException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oleksii
 */
public class UnitTest {
     @Test
    public void testEmployeeCreation() throws IncorrectSalaryException {
        try {
            Employee emp1 = new Employee("John", "Doe", 5000);
            assertEquals("John", emp1.getName());
            assertEquals("Doe", emp1.getSurname());
            assertEquals(5000, emp1.getSalary(), 0.001); // Using delta for comparing double values
        } catch (FieldLengthLimitException | IncorrectSalaryException ex) {
            fail("Exception thrown when it shouldn't have: " + ex.getMessage());
        }
    }

  
}
