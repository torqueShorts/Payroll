package za.acCPUT.Service.Impl;


import za.acCPUT.Domain.Employee;
import za.acCPUT.Repository.Impl.EmployeeRepoImpl;
import za.acCPUT.Repository.Repos.EmployeeRepo;
import za.acCPUT.Service.Services.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService
{

    private static EmployeeServiceImpl service = null;
    private EmployeeRepo repository;

    private EmployeeServiceImpl()
    {
        this.repository = EmployeeRepoImpl.getRepository();
    }

    public static EmployeeServiceImpl getService()
    {
        if(service == null)
        {
            service = new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Employee creat(Employee obj) {
        return this.repository.create(obj);
    }

    @Override
    public Employee update(Employee obj) {
        return this.repository.update(obj);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delet(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }
}
