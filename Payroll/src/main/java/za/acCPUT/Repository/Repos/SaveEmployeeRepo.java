package za.acCPUT.Repository.Repos;

import za.acCPUT.Domain.SaveEmployee;

import java.util.Set;

public interface SaveEmployeeRepo extends MainRepository <SaveEmployee, String> {
    Set<SaveEmployee> getAll();
}
