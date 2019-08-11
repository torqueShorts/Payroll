package za.acCPUT.Factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void getRace()
    {
        Race race = RaceFactory.getRace("30A");

        Assert.assertNotNull(race.getRaceId());
        Assert.assertNotNull(race);
    }
}
