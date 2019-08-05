package za.acCPUT.Service.Services;

import za.acCPUT.Domain.Employee;

import java.util.Set;

public interface EmployeeService extends MainService <Employee,String>
{
    Set<Employee> getAll();
}
