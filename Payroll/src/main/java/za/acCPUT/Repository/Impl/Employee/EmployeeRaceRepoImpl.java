package za.acCPUT.Repository.Impl.Employee;

import za.acCPUT.Domain.Employee.EmployeeRace;
import za.acCPUT.Repository.Repos.Employee.EmployeeRaceRepo;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepoImpl implements EmployeeRaceRepo {

    private static EmployeeRaceRepoImpl repository = null;
    private Set<EmployeeRace> employees;

    public EmployeeRaceRepoImpl()
    {
        this.employees = new HashSet<>();
    }

    private EmployeeRace findEmployee(final String empId)
    {
        return this.employees.stream()
                .filter(employee -> employee.getUserId().trim().equals(empId))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRaceRepoImpl getRepository()
    {
        if(repository == null)
        {
            repository = new EmployeeRaceRepoImpl();
        }

        return repository;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.employees;
    }

    @Override
    public EmployeeRace create(EmployeeRace c) {
        this.employees.add(c);
        return c;
    }

    @Override
    public EmployeeRace update(EmployeeRace c) {
        EmployeeRace delete = findEmployee(c.getUserId());
        if(delete != null)
        {
            this.employees.remove(delete);
            return create(c);
        }
        return null;
    }

    @Override
    public void delet(String obj) {
        EmployeeRace emp = findEmployee(obj);
        if(emp != null)
        {
            this.employees.remove(emp);
        }
    }

    @Override
    public EmployeeRace read(String obj) {
        EmployeeRace emp = findEmployee(obj);
        return emp;
    }
}


