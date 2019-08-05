package za.acCPUT.Repository.Impl;

import za.acCPUT.Domain.Race;
import za.acCPUT.Repository.Repos.RaceRepo;

import java.util.HashSet;
import java.util.Set;

public class RaceRepoImpl implements RaceRepo
{

    private static RaceRepoImpl repository = null;
    private Set<Race> races;

    private RaceRepoImpl()
    {
        this.races = new HashSet<>();
    }

    private Race findRace(String raceId)
    {
        return this.races.stream()
                .filter(race -> race.getRaceId().trim().equals(raceId))
                .findAny()
                .orElse(null);
    }

    public static RaceRepoImpl getRepository()
    {
        if(repository == null)
        {
            repository = new RaceRepoImpl();
        }
        return repository;
    }


    @Override
    public Set<Race> getAll() {
        return this.races;
    }

    @Override
    public Race create(Race c) {
        this.races.add(c);
        return c;
    }

    @Override
    public Race update(Race c) {
        Race delete = findRace(c.getRaceId());
        if(delete != null)
        {
            this.races.remove(delete);
            return create(c);
        }
        return null;
    }

    @Override
    public void delet(String obj) {
        Race race = findRace(obj);
        if(race != null)
        {
            this.races.remove(race);
        }
    }

    @Override
    public Race read(String obj) {
        Race race = findRace(obj);
        return race;
    }
}
