package za.acCPUT.Service.Services;

import za.acCPUT.Domain.Gender;

import java.util.Set;

public interface GenderService extends MainService <Gender,String>
{
    Set<Gender> getAll();
}
