package za.acCPUT.Factory;

import za.acCPUT.Domain.Employee;
import za.acCPUT.Domain.Gender;
import za.acCPUT.Domain.Race;
import za.acCPUT.Util.IdGenerator;

public class GenderFactory
{

    public static Gender getGender(String gender)
    {
        return new Gender.Builder()
                .genderId(IdGenerator.idGenerate())
                .gender(gender)
                .build();
    }
}
