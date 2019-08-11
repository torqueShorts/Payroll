package za.acCPUT.Factory;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.SaveEmployee;

import static org.junit.Assert.*;

public class SaveEmployeeFactoryTest {
    @Test
    public void getSavedEmployee()
    {
        SaveEmployee race = SaveEmployeeFactory.getSavedEmployee("UserId02","Chad","Wyngaard","CO2","30A");
        Assert.assertNotNull(race.getRaceId());
        Assert.assertNotNull(race);
    }
}
