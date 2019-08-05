package za.acCPUT.Factory;

import za.acCPUT.Domain.Race;
import za.acCPUT.Util.IdGenerator;

public class RaceFactory
{
    public static Race getRace(String race)
    {
        return new Race.Builder()
                .raceId(IdGenerator.idGenerate())
                .race(race)
                .build();
    }
}
