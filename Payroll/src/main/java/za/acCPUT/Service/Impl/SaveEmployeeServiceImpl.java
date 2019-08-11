package za.acCPUT.Service.Impl;


import za.acCPUT.Domain.Employee.Employee;
import za.acCPUT.Domain.Employee.EmployeeGender;
import za.acCPUT.Domain.Employee.EmployeeRace;
import za.acCPUT.Domain.Gender;
import za.acCPUT.Domain.Race;
import za.acCPUT.Domain.SaveEmployee;
import za.acCPUT.Factory.Employee.EmployeeFactory;
import za.acCPUT.Factory.Employee.EmployeeGenderFactory;
import za.acCPUT.Factory.Employee.EmployeeRaceFactory;
import za.acCPUT.Factory.GenderFactory;
import za.acCPUT.Factory.RaceFactory;
import za.acCPUT.Repository.Impl.SaveEmployeeRepoImpl;
import za.acCPUT.Repository.Repos.SaveEmployeeRepo;
import za.acCPUT.Service.Impl.Employee.EmployeeGenderServiceImpl;
import za.acCPUT.Service.Impl.Employee.EmployeeRaceServiceImpl;
import za.acCPUT.Service.Impl.Employee.EmployeeServiceImpl;
import za.acCPUT.Service.Impl.GenderServiceImpl;
import za.acCPUT.Service.Impl.RaceServiceImpl;
import za.acCPUT.Service.Services.Employee.EmployeeGenderService;
import za.acCPUT.Service.Services.Employee.EmployeeRaceService;
import za.acCPUT.Service.Services.SaveEmployeeService;

import java.util.Set;

public class SaveEmployeeServiceImpl implements SaveEmployeeService{




    private static SaveEmployeeServiceImpl service = null;
    private SaveEmployeeRepo repository;

    public SaveEmployeeServiceImpl()
    {
        this.repository = SaveEmployeeRepoImpl.getRepository();
    }

    public static SaveEmployeeServiceImpl  getService()
    {
        if(service == null)
        {
            service = new SaveEmployeeServiceImpl();
        }
        return service;
    }



    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl().getService();
    private EmployeeGenderService employeeGenderService = new EmployeeGenderServiceImpl().getService();
    private EmployeeRaceService employeeRaceService = new EmployeeRaceServiceImpl().getService();

    private GenderServiceImpl genderService = new GenderServiceImpl().getService();
    private RaceServiceImpl raceService = new RaceServiceImpl().getService();

    public String CreateEmployee(String firstName, String lastName, String genderId, String raceId)
    {
        Employee employee = EmployeeFactory.buildEmployee(firstName,lastName);
        EmployeeRace employeeRace = EmployeeRaceFactory.createEmployeeRace(employee.getUserId(),raceId);
        EmployeeGender employeeGender = EmployeeGenderFactory.createEmployeeGender(employee.getUserId(),genderId);

        Gender gender = GenderFactory.getGender(employeeGender.getGenderId());
        Race race = RaceFactory.getRace(employeeRace.getRaceId());


        employeeService.creat(employee);
        employeeGenderService.creat(employeeGender);
        employeeRaceService.creat(employeeRace);

        genderService.creat(gender);
        raceService.creat(race);
        return null;
    }


    @Override
    public Set<SaveEmployee> getAll() {
        return this.repository.getAll();
    }

    @Override
    public SaveEmployee creat(SaveEmployee obj) {
        return this.repository.create(obj);
    }

    @Override
    public SaveEmployee update(SaveEmployee obj) {
        return this.repository.update(obj);
    }

    @Override
    public void delete(String s) {
        this.repository.delet(s);
    }

    @Override
    public SaveEmployee read(String s) {
        return this.repository.read(s);
    }
}
