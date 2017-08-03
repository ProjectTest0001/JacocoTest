package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    private Employee emp = new Employee();
    @Before
    public void setUp() throws Exception {
        emp.setId("no2");
    }

    @Test
    public void testGetId() {
        emp.setId("no1");
        assertEquals("no1", emp.getId());
    }

}
