package za.acCPUT.Factory.Employee;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Employee.EmployeeGender;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {


    @Test
    public void createEmployeeGender() {

        EmployeeGender employee = EmployeeGenderFactory.createEmployeeGender("UserId01", "CO2");

        Assert.assertNotNull(employee.getUserId());
        Assert.assertNotNull(employee);
    }
}
