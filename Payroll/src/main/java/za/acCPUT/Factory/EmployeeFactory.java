package za.acCPUT.Factory;

import za.acCPUT.Domain.Employee;
import za.acCPUT.Domain.Gender;
import za.acCPUT.Domain.Race;
import za.acCPUT.Util.IdGenerator;

public class EmployeeFactory
{
     public static Employee buildEmployee(String name, String surname, Gender gender, Race race)
     {
         return new Employee.Builder()
                 .userId(IdGenerator.idGenerate())
                 .name(name)
                 .surname(surname)
                 .gender(gender)
                 .race(race)
                 .build();
     }
}
