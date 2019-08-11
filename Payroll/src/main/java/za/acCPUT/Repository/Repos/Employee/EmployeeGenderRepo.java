package za.acCPUT.Repository.Repos.Employee;

import za.acCPUT.Domain.Employee.EmployeeGender;
import za.acCPUT.Repository.Repos.MainRepository;

import java.util.Set;

public interface EmployeeGenderRepo extends MainRepository <EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
