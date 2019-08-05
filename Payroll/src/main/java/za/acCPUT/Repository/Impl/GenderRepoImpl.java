package za.acCPUT.Repository.Impl;

import za.acCPUT.Domain.Gender;
import za.acCPUT.Repository.Repos.GenderRepo;

import java.util.HashSet;
import java.util.Set;

public class GenderRepoImpl implements GenderRepo
{
    private static GenderRepoImpl repository = null;
    private Set<Gender> genders;

    private GenderRepoImpl()
    {
        this.genders = new HashSet<>();
    }

    private Gender findGender(String genderId)
    {
        return this.genders.stream()
                .filter(gender -> gender.getGenderId().trim().equals(genderId))
                .findAny()
                .orElse(null);
    }

    public static GenderRepoImpl getRepository()
    {
        if(repository == null)
        {
            repository = new GenderRepoImpl();
        }

        return repository;
    }




    @Override
    public Set<Gender> getAll() {
        return this.genders;
    }

    @Override
    public Gender create(Gender c) {
        this.genders.add(c);
        return c;
    }

    @Override
    public Gender update(Gender c) {

        Gender delete = findGender(c.getGenderId());
        if(delete != null)
        {
            this.genders.remove(delete);
            return create(c);
        }
        return null;
    }

    @Override
    public void delet(String obj)
    {
        Gender gen = findGender(obj);
        if(gen != null)
        {
            this.genders.remove(gen);
        }
    }

    @Override
    public Gender read(String obj) {
        Gender gen = findGender(obj);
        return gen;
    }
}
