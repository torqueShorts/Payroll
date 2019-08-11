package za.acCPUT.Repository.Impl.Employee;

import za.acCPUT.Domain.Employee.Employee;
import za.acCPUT.Repository.Repos.Employee.EmployeeRepo;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepoImpl implements EmployeeRepo
{

    private static EmployeeRepoImpl repository = null;
    private Set<Employee> employees;

    public EmployeeRepoImpl()
    {
        this.employees = new HashSet<>();
    }

    private Employee findEmployee(final String empId)
    {
        return this.employees.stream()
                .filter(employee -> employee.getUserId().trim().equals(empId))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRepoImpl getRepository()
    {
        if(repository == null)
        {
            repository = new EmployeeRepoImpl();
        }

        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }

    @Override
    public Employee create(Employee emp) {
        this.employees.add(emp);
        return emp;
    }

    @Override
    public Employee update(Employee emp) {

        Employee delete = findEmployee(emp.getUserId());
        if(delete != null)
        {
            this.employees.remove(delete);
            return create(emp);
        }
        return null;
    }

    @Override
    public void delet(String id)
    {
        Employee emp = findEmployee(id);
        if(emp != null)
        {
            this.employees.remove(emp);
        }
    }

    @Override
    public Employee read(String id)
    {
        Employee emp = findEmployee(id);
        return emp;
    }
}
