
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junitpioneer.vintage.Test;
import sumdu.edu.ua.java_employeepract.Employee;
import sumdu.edu.ua.java_employeepract.FieldLengthLimitException;
import sumdu.edu.ua.java_employeepract.IncorrectSalaryException;



/**
 *
 * @author Oleksii
 */
public class TestEmployee {

    @Test
    public void testCreateEmployee() throws FieldLengthLimitException, IncorrectSalaryException {
        String name = "John";
        String surname = "Doe";
        double salary = 5000;

        Employee testEmp = null;
        try {
            testEmp = new Employee(name, surname, salary);
        } catch (FieldLengthLimitException ex) {
            Logger.getLogger(TestEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        assertEquals(name, testEmp.getName());
        assertEquals(surname, testEmp.getSurname());
        assertEquals(salary, testEmp.getSalary(), 0.001);
    }

    @Test
    public void testEmployeeNameLengthLimitException() throws FieldLengthLimitException, IncorrectSalaryException {
        String name = "Johnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
        String surname = "Doe";
        double salary = 5000;

        try {
            new Employee(name, surname, salary);
            fail("FieldLengthLimitException should have been thrown");
        } catch (FieldLengthLimitException ex) {
            assertTrue(ex.getMessage().contains("Name lenght exceeds the limit 20 simbol"));
        }
    }
  
   @Test
    public void testEmployeeSurNameLengthLimitException() throws FieldLengthLimitException, IncorrectSalaryException {
        String name = "John";
        String surname = "Doeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        double salary = 5000;

        try {
            new Employee(name, surname, salary);
            fail("FieldLengthLimitException should have been thrown");
        } catch (FieldLengthLimitException ex) {
            assertTrue(ex.getMessage().contains("Surname lenght exceeds the limit 20 simbol"));
        }
    }
@Test
    public void testEmployeeIncorrectSalaryException() throws FieldLengthLimitException, IncorrectSalaryException {
        String name = "John";
        String surname = "Doe";
        double salary = -5000;

        try {
            new Employee(name, surname, salary);
            fail("IncorrectSalaryException should have been thrown");
        } catch (IncorrectSalaryException ex) {
            assertTrue(ex.getMessage().contains("Salary can't be negative"));
        }
    }
    
}
