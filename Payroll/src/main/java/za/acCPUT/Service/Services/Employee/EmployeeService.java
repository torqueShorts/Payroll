package za.acCPUT.Service.Services.Employee;

import za.acCPUT.Domain.Employee.Employee;
import za.acCPUT.Service.Services.MainService;

import java.util.Set;

public interface EmployeeService extends MainService<Employee,String>
{
    Set<Employee> getAll();
}
