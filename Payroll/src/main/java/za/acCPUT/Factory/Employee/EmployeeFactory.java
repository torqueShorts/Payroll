package za.acCPUT.Factory.Employee;

import za.acCPUT.Domain.Employee.Employee;
import za.acCPUT.Util.IdGenerator;

public class EmployeeFactory
{
     public static Employee buildEmployee(String name, String surname)
     {
         return new Employee.Builder()
                 .userId(IdGenerator.idGenerate())
                 .name(name)
                 .surname(surname)
                 .build();
     }
}
