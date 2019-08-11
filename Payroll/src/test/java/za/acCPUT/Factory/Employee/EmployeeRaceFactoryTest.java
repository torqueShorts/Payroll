package za.acCPUT.Factory.Employee;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Employee.EmployeeRace;

import static org.junit.Assert.*;


public class EmployeeRaceFactoryTest {


    @Test
    public void createEmployeeRace() {

        EmployeeRace employee = EmployeeRaceFactory.createEmployeeRace("UserId01", "30A");

        Assert.assertNotNull(employee.getUserId());
        Assert.assertNotNull(employee);

    }
}
