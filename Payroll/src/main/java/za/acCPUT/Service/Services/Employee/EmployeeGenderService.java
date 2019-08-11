package za.acCPUT.Service.Services.Employee;

import za.acCPUT.Domain.Employee.EmployeeGender;
import za.acCPUT.Service.Services.MainService;

import java.util.Set;

public interface EmployeeGenderService extends MainService <EmployeeGender, String>
{
    Set<EmployeeGender> getAll();
}
