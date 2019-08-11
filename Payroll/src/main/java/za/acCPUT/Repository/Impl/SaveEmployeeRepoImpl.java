package za.acCPUT.Repository.Impl;

import za.acCPUT.Domain.SaveEmployee;
import za.acCPUT.Repository.Repos.SaveEmployeeRepo;

import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeRepoImpl implements SaveEmployeeRepo {

    private static SaveEmployeeRepoImpl repository = null;
    private Set<SaveEmployee> savedEmployees;

    private SaveEmployeeRepoImpl()
    {
        this.savedEmployees = new HashSet<>();
    }

    private SaveEmployee findEmployee(String userId)
    {
        return this.savedEmployees.stream()
                .filter(saveEmployee -> saveEmployee.getUserId().trim().equals(userId))
                .findAny()
                .orElse(null);
    }

    public static SaveEmployeeRepoImpl getRepository()
    {
        if(repository == null)
        {
            repository = new SaveEmployeeRepoImpl();
        }
        return repository;
    }

    @Override
    public Set<SaveEmployee> getAll() {
        return this.savedEmployees;
    }

    @Override
    public SaveEmployee create(SaveEmployee c) {
        this.savedEmployees.add(c);
        return c;
    }

    @Override
    public SaveEmployee update(SaveEmployee c) {
        SaveEmployee delete = findEmployee(c.getUserId());
        if(delete != null)
        {
            this.savedEmployees.remove(delete);
            return create(c);
        }
        return null;
    }

    @Override
    public void delet(String obj) {
        SaveEmployee saveEmployee = findEmployee(obj);
        if(saveEmployee != null)
        {
            this.savedEmployees.remove(saveEmployee);
        }
    }

    @Override
    public SaveEmployee read(String obj) {
        SaveEmployee saveEmployee = findEmployee(obj);
        return saveEmployee;
    }
}
