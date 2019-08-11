package za.acCPUT.Repository.Impl.Employee;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Employee.Employee;
import za.acCPUT.Factory.Employee.EmployeeFactory;
import za.acCPUT.Repository.Repos.Employee.EmployeeRepo;
import za.acCPUT.Util.IdGenerator;

import java.util.Set;

import static org.junit.Assert.*;


public class EmployeeRepoImplTest {

    private EmployeeRepo repo = EmployeeRepoImpl.getRepository();
    private Employee employee = EmployeeFactory.buildEmployee("Chad","Wyngaard");

    private Employee getSavedEmployee() {
        Set<Employee> savedEmployee = repo.getAll();
        return savedEmployee.iterator().next();
    }

    @Test
    public void create()
    {
        Employee created = repo.create(employee);
        Assert.assertSame(created,employee);
    }

    @Test
    public void update()
    {
        String newEmployee = "Wyngaard";
        Employee employee = new Employee.Builder().copy(getSavedEmployee()).userId(IdGenerator.idGenerate()).build();
        System.out.println("In update, about_to_updated = " + employee);
        Employee updated = repo.update(employee);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newEmployee, updated.getSurname());
    }

    @Test
    public void delet()
    {
        Employee savedEmployee = getSavedEmployee();
        repo.delet(savedEmployee.getUserId());
    }

    @Test
    public void read()
    {
        Employee savedEmployee = getSavedEmployee();
        System.out.println("In read, userId = "+ savedEmployee.getUserId());
        Employee read = repo.read(savedEmployee.getUserId());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedEmployee, read);
    }

    @Test
    public void getAll()
    {
        Set<Employee> employees = repo.getAll();
        Assert.assertSame(1,employees.size());
    }
}
