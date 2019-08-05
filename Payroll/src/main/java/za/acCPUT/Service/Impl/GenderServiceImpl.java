package za.acCPUT.Service.Impl;

import za.acCPUT.Domain.Gender;
import za.acCPUT.Repository.Impl.GenderRepoImpl;
import za.acCPUT.Repository.Repos.GenderRepo;
import za.acCPUT.Service.Services.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service = null;
    private GenderRepo repository;

    private GenderServiceImpl()
    {
        this.repository = GenderRepoImpl.getRepository();
    }

    public static GenderServiceImpl getService()
    {
        if(service == null)
        {
            service = new GenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Gender creat(Gender obj) {
        return this.repository.create(obj);
    }

    @Override
    public Gender update(Gender obj) {
        return this.repository.update(obj);
    }

    @Override
    public void delete(String s) {
        this.repository.delet(s);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }
}
