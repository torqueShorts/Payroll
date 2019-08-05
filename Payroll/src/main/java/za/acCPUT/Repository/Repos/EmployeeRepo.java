package za.acCPUT.Repository.Repos;

import za.acCPUT.Domain.Employee;

import java.util.Set;

public interface EmployeeRepo extends MainRepository <Employee, String>
{
    Set<Employee> getAll();
}
