package za.acCPUT.Repository.Repos.Employee;

import za.acCPUT.Domain.Employee.EmployeeRace;
import za.acCPUT.Repository.Repos.MainRepository;

import java.util.Set;

public interface EmployeeRaceRepo extends MainRepository <EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
