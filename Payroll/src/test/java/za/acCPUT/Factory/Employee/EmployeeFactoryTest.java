package za.acCPUT.Factory.Employee;

import org.junit.Assert;
import org.junit.Test;
import za.acCPUT.Domain.Employee.Employee;
import za.acCPUT.Domain.Gender;
import za.acCPUT.Domain.Race;
import za.acCPUT.Factory.Employee.EmployeeFactory;
import za.acCPUT.Factory.GenderFactory;
import za.acCPUT.Factory.RaceFactory;

public class EmployeeFactoryTest {

    GenderFactory gender = new GenderFactory();
    RaceFactory race = new RaceFactory();

    Race empRace = race.getRace("Black");
    Gender empGender = gender.getGender("Male");

    @Test
    public void buildEmployee()
    {
        Employee employee = EmployeeFactory.buildEmployee("John","Son");

        Assert.assertNotNull(employee.getUserId());
        Assert.assertNotNull(employee);

    }

}
