package za.acCPUT.Factory.Employee;

import za.acCPUT.Domain.Employee.EmployeeGender;

public class EmployeeGenderFactory
{
    public static EmployeeGender createEmployeeGender(String userId, String genderId)
    {
        return new EmployeeGender.Builder()
                .userId(userId)
                .genderId(genderId)
                .build();
    }
}
