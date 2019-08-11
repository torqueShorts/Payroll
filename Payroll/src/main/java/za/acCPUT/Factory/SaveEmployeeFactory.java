package za.acCPUT.Factory;

import za.acCPUT.Domain.SaveEmployee;

public class SaveEmployeeFactory {
    public static SaveEmployee getSavedEmployee(String userId, String name, String surname, String genderid, String raceId)
    {
        return new SaveEmployee.Builder()
                .userId(userId)
                .name(name)
                .surname(surname)
                .genderId(genderid)
                .raceId(raceId)
                .build();
    }
}
