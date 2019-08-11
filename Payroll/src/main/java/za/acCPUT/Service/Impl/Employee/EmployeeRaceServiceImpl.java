package za.acCPUT.Service.Impl.Employee;

import za.acCPUT.Domain.Employee.EmployeeGender;
import za.acCPUT.Domain.Employee.EmployeeRace;
import za.acCPUT.Repository.Impl.Employee.EmployeeRaceRepoImpl;
import za.acCPUT.Repository.Repos.Employee.EmployeeRaceRepo;
import za.acCPUT.Service.Services.Employee.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImpl implements EmployeeRaceService {

    private static EmployeeRaceServiceImpl service = null;
    private EmployeeRaceRepo repository;

    public EmployeeRaceServiceImpl()
    {
        this.repository = EmployeeRaceRepoImpl.getRepository();
    }

    public static EmployeeRaceServiceImpl getService()
    {
        if(service == null)
        {
            service = new EmployeeRaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeRace creat(EmployeeRace obj) {
        return this.repository.create(obj);
    }

    @Override
    public EmployeeRace update(EmployeeRace obj) {
        return this.repository.update(obj);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delet(s);
    }

    @Override
    public EmployeeRace read(String s) {
        return this.repository.read(s);
    }
}
