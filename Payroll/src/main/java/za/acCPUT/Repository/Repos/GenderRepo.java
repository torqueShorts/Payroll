package za.acCPUT.Repository.Repos;

import za.acCPUT.Domain.Gender;

import java.util.Set;

public interface GenderRepo extends MainRepository <Gender,String>
{
    Set<Gender> getAll();
}
