package za.acCPUT.Repository.Repos;

import za.acCPUT.Domain.Race;

import java.util.Set;

public interface RaceRepo extends MainRepository <Race, String>
{
    Set<Race> getAll();
}
