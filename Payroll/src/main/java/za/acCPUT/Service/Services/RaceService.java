package za.acCPUT.Service.Services;

import za.acCPUT.Domain.Race;

import java.util.Set;

public interface RaceService extends MainService <Race,String>
{
    Set<Race> getAll();
}
