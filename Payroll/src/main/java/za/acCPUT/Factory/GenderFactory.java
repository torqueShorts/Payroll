package za.acCPUT.Factory;

import za.acCPUT.Domain.Gender;

public class GenderFactory
{

    public static Gender getGender(String genderId)
    {
        return new Gender.Builder()
                .genderId(genderId)
                .build();
    }
}
