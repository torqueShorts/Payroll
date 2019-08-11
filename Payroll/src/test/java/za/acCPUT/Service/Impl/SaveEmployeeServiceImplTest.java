package za.acCPUT.Service.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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
import za.acCPUT.Factory.SaveEmployeeFactory;
import za.acCPUT.Repository.Impl.SaveEmployeeRepoImpl;
import za.acCPUT.Service.Impl.Employee.EmployeeGenderServiceImpl;
import za.acCPUT.Service.Impl.Employee.EmployeeRaceServiceImpl;
import za.acCPUT.Service.Impl.Employee.EmployeeServiceImpl;
import za.acCPUT.Service.Services.Employee.EmployeeGenderService;
import za.acCPUT.Service.Services.Employee.EmployeeRaceService;

import static org.junit.Assert.*;


public class SaveEmployeeServiceImplTest {

    private SaveEmployeeRepoImpl repository;

    SaveEmployeeServiceImpl saveEmployeeService = new SaveEmployeeServiceImpl();

    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl().getService();
    private EmployeeGenderService employeeGenderService = new EmployeeGenderServiceImpl().getService();
    private EmployeeRaceService employeeRaceService = new EmployeeRaceServiceImpl().getService();

    private GenderServiceImpl genderService = new GenderServiceImpl().getService();
    private RaceServiceImpl raceService = new RaceServiceImpl().getService();

    Employee employee = EmployeeFactory.buildEmployee("Chad","Wyngaard");
    EmployeeRace employeeRace = EmployeeRaceFactory.createEmployeeRace(employee.getUserId(),"30A");
    EmployeeGender employeeGender = EmployeeGenderFactory.createEmployeeGender(employee.getUserId(),"CO2");

    Gender gender = GenderFactory.getGender(employeeGender.getGenderId());
    Race race = RaceFactory.getRace(employeeRace.getRaceId());

    SaveEmployeeFactory saveEmp = new SaveEmployeeFactory();



    @Before
    public void setUp() throws Exception
    {
        this.repository = SaveEmployeeRepoImpl.getRepository();
    }


    @Test
    public void getAll()
    {

    }

    @Test
    public void creat() {

        employeeService.creat(employee);
        employeeGenderService.creat(employeeGender);
        employeeRaceService.creat(employeeRace);

        genderService.creat(gender);
        raceService.creat(race);

        SaveEmployee savedEmployee = saveEmp.getSavedEmployee(employee.getUserId(),employee.getName(),employee.getSurname(),gender.getGender(),race.getRace());

        SaveEmployee created = this.repository.create(savedEmployee);

        Assert.assertEquals("Employee details: ID: " + employee.getUserId() + " firstName: Chad surname: Wyngaard" +
                " gender: Female race: Black", this.repository.create(savedEmployee).toString());

        System.out.println(saveEmployeeService.getAll());

    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}
