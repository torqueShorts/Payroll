package za.acCPUT.Service.Services;


import za.acCPUT.Domain.SaveEmployee;

import java.util.Set;

public interface SaveEmployeeService extends MainService <SaveEmployee, String>{
    Set<SaveEmployee> getAll();
}
