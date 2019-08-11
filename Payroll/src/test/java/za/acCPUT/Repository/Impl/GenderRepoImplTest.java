package za.acCPUT.Repository.Impl;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Gender;
import za.acCPUT.Factory.GenderFactory;
import za.acCPUT.Repository.Repos.GenderRepo;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepoImplTest {

    private GenderRepo repo = GenderRepoImpl.getRepository();
    private Gender gender = GenderFactory.getGender("CO2");

    private Gender getSavedGender() {
        Set<Gender> savedGender = repo.getAll();
        return savedGender.iterator().next();
    }


    @Test
    public void create()
    {
        Gender created = repo.create(gender);
        Assert.assertSame(created,gender);
    }

    @Test
    public void update()
    {
        String newGender = "Female";
        Gender gender = new Gender.Builder().copy(getSavedGender()).genderId("CO2").build();
        System.out.println("In update, about_to_updated = " + gender);
        Gender updated = repo.update(gender);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newGender, updated.getGender());
    }

    @Test
    public void delet()
    {
        Gender savedGender = getSavedGender();
        repo.delet(savedGender.getGenderId());
    }

    @Test
    public void read()
    {
        Gender savedGender = getSavedGender();
        System.out.println("In read, genderId= "+ savedGender.getGenderId());
        Gender read = repo.read(savedGender.getGenderId());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedGender, read);
    }

    @Test
    public void getAll() {
        Set<Gender> genders = repo.getAll();
        Assert.assertSame(1,genders.size());
    }
}
