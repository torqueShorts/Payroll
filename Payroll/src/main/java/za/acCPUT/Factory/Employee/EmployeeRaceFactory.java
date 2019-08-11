package za.acCPUT.Factory.Employee;

import za.acCPUT.Domain.Employee.EmployeeRace;

public class EmployeeRaceFactory
{
    public static EmployeeRace createEmployeeRace(String userId, String raceId)
    {
        return new EmployeeRace.Builder()
                .userId(userId)
                .raceId(raceId)
                .build();
    }
}
