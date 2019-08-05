package za.acCPUT.Factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Employee;
import za.acCPUT.Domain.Gender;
import za.acCPUT.Domain.Race;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    GenderFactory gender = new GenderFactory();
    RaceFactory race = new RaceFactory();

    Race empRace = race.getRace("Black");
    Gender empGender = gender.getGender("Male");

    @Test
    public void buildEmployee()
    {
        Employee employee = EmployeeFactory.buildEmployee("John","Son",empGender,empRace);

        Assert.assertNotNull(employee.getUserId());
        Assert.assertNotNull(employee);
        Assert.assertEquals("John",employee.getName());

    }

}
