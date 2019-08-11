package za.acCPUT.Service.Services.Employee;

import za.acCPUT.Domain.Employee.EmployeeGender;
import za.acCPUT.Domain.Employee.EmployeeRace;
import za.acCPUT.Service.Services.MainService;

import java.util.Set;

public interface EmployeeRaceService extends MainService <EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
