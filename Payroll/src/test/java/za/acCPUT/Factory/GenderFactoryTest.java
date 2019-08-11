package za.acCPUT.Factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Gender;

import static org.junit.Assert.*;


public class GenderFactoryTest {
    @Test
    public void getGender() {
        Gender gender = GenderFactory.getGender("CO2");

        Assert.assertNotNull(gender.getGenderId());
        Assert.assertNotNull(gender);
    }
}
