package za.acCPUT.Repository.Repos.Employee;

import za.acCPUT.Domain.Employee.Employee;
import za.acCPUT.Repository.Repos.MainRepository;

import java.util.Set;

public interface EmployeeRepo extends MainRepository<Employee, String>
{
    Set<Employee> getAll();
}
