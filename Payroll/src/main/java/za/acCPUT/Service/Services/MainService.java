package za.acCPUT.Service.Services;

public interface MainService <Class, ID>
{
    Class creat(Class obj);
    Class update(Class obj);
    void delete(ID id);
    Class read(ID id);
}
