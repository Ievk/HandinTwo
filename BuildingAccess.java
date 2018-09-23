import java.util.HashSet;

public class BuildingAccess
{
    private HashSet<String> personsInBuilding;

    public BuildingAccess() {
        personsInBuilding = new HashSet<>();
    }

    public boolean isPersonInBuilding(String userID)
    {
        return personsInBuilding.contains(userID);
    }

    public Iterable<String> getUsersInside()
    {
        return personsInBuilding;
    }

    public boolean enter(String userID)
    {
        if (!isPersonInBuilding(userID))
        {
            personsInBuilding.add(userID);
            return true;
        }
        else
            {
            System.out.println("ERROR: According to our logs, user "+userID+" is already inside, and therefore must be questioned!");
            return false;
        }
    }
    public boolean exit(String userID)
    {
        if (isPersonInBuilding(userID))
        {
            personsInBuilding.remove(userID);
            return true;
        }
        else
        {
            System.out.println("ERROR: According to our logs, user "+userID+" is not inside, and therefore must be questioned!");
            return false;
        }
    }


}
