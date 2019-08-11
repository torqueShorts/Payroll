package za.acCPUT.Repository.Impl;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import za.acCPUT.Domain.Race;
import za.acCPUT.Factory.RaceFactory;
import za.acCPUT.Repository.Repos.RaceRepo;

import java.util.Set;

import static org.junit.Assert.*;


public class RaceRepoImplTest {

    private RaceRepo repo = RaceRepoImpl.getRepository();
    private Race race = RaceFactory.getRace("30A");

    private Race getSavedRace() {
        Set<Race> savedRace = repo.getAll();
        return savedRace.iterator().next();
    }

    @Test
    public void create()
    {
        Race created = repo.create(race);
        Assert.assertSame(created,race);
    }

    @Test
    public void update()
    {
        String newRace = "Black";
        Race race = new Race.Builder().copy(getSavedRace()).raceId("30A").build();
        System.out.println("In update, about_to_updated = " + race);
        Race updated = repo.update(race);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newRace, updated.getRace());
    }

    @Test
    public void delet()
    {
        Race savedrace = getSavedRace();
        repo.delet(savedrace.getRaceId());
    }

    @Test
    public void read()
    {
        Race savedRace = getSavedRace();
        System.out.println("In read, raceId = "+ savedRace.getRaceId());
        Race read = repo.read(savedRace.getRaceId());
        System.out.println("In read, read = " + read);
        Assert.assertEquals(savedRace, read);
    }

    @Test
    public void getAll()
    {
        Set<Race> races = repo.getAll();
        Assert.assertSame(1,races.size());
    }
}
