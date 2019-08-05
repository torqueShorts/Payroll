package za.acCPUT.Service.Impl;

import za.acCPUT.Domain.Race;
import za.acCPUT.Repository.Impl.GenderRepoImpl;
import za.acCPUT.Repository.Impl.RaceRepoImpl;
import za.acCPUT.Repository.Repos.GenderRepo;
import za.acCPUT.Repository.Repos.RaceRepo;
import za.acCPUT.Service.Services.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService
{
    private static RaceServiceImpl service = null;
    private RaceRepo repository;

    public static RaceServiceImpl  getService()
    {
        if(service == null)
        {
            service = new RaceServiceImpl();
        }
        return service;
    }

    private RaceServiceImpl()
    {
        this.repository = RaceRepoImpl.getRepository();
    }


    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Race creat(Race obj) {
        return this.repository.create(obj);
    }

    @Override
    public Race update(Race obj) {
        return this.repository.update(obj);
    }

    @Override
    public void delete(String s) {
        this.repository.delet(s);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }
}
