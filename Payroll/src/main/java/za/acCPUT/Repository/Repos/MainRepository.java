package za.acCPUT.Repository.Repos;

public interface MainRepository <Class, Object>
{
    Class create(Class c);
    Class update(Class c);
    void delet(Object obj);
    Class read(Object obj);

}
