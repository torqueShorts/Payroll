package za.acCPUT.Repository.Impl.Employee;

import za.acCPUT.Domain.Employee.EmployeeGender;
import za.acCPUT.Repository.Repos.Employee.EmployeeGenderRepo;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepoImpl implements EmployeeGenderRepo {

    private static EmployeeGenderRepoImpl repository = null;
    private Set<EmployeeGender> employees;

    public EmployeeGenderRepoImpl()
    {
        this.employees = new HashSet<>();
    }

    private EmployeeGender findEmployee(final String empId)
    {
        return this.employees.stream()
                .filter(employee -> employee.getUserId().trim().equals(empId))
                .findAny()
                .orElse(null);
    }

    public static EmployeeGenderRepoImpl getRepository()
    {
        if(repository == null)
        {
            repository = new EmployeeGenderRepoImpl();
        }

        return repository;
    }


    @Override
    public Set<EmployeeGender> getAll() {
        return this.employees;
    }

    @Override
    public EmployeeGender create(EmployeeGender c) {
        this.employees.add(c);
        return c;
    }

    @Override
    public EmployeeGender update(EmployeeGender c) {

        EmployeeGender delete = findEmployee(c.getUserId());
        if(delete != null)
        {
            this.employees.remove(delete);
            return create(c);
        }
        return null;
    }

    @Override
    public void delet(String obj) {
        EmployeeGender emp = findEmployee(obj);
        if(emp != null)
        {
            this.employees.remove(emp);
        }
    }

    @Override
    public EmployeeGender read(String obj) {
        EmployeeGender emp = findEmployee(obj);
        return emp;
    }
}
