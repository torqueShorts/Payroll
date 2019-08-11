package za.acCPUT.Service.Impl.Employee;

import za.acCPUT.Domain.Employee.EmployeeGender;
import za.acCPUT.Repository.Impl.Employee.EmployeeGenderRepoImpl;
import za.acCPUT.Repository.Repos.Employee.EmployeeGenderRepo;
import za.acCPUT.Service.Services.Employee.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {
    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepo repository;

    public EmployeeGenderServiceImpl()
    {
        this.repository = EmployeeGenderRepoImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService()
    {
        if(service == null)
        {
            service = new EmployeeGenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeGender creat(EmployeeGender obj) {
        return this.repository.create(obj);
    }

    @Override
    public EmployeeGender update(EmployeeGender obj) {
        return this.repository.update(obj);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delet(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }
}
