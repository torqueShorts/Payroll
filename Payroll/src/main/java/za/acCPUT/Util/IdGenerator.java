package za.acCPUT.Util;

import java.util.UUID;

public class IdGenerator
{
    public static String idGenerate()
    {
        return UUID.randomUUID().toString();
    }
}
