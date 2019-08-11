package za.acCPUT.Factory;

import za.acCPUT.Domain.Race;
import za.acCPUT.Util.IdGenerator;

public class RaceFactory
{
    public static Race getRace(String raceId)
    {
        return new Race.Builder()
                .raceId(raceId)
                .build();
    }
}
