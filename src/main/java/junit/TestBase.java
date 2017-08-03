package junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestBase extends SpringTest{

    @Test
    public void testEmployee(){
        Employee employee = getBean(Employee.class);
        employee.setId("no1");
        assertEquals("no1",employee.getId());
    }
}
