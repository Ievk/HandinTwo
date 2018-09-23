import java.util.ArrayList;

public class AccessControl {

    private BuildingAccess buildingAccess;
    private SpecAreaAccess areaAccess;


    public AccessControl(){
        buildingAccess = new BuildingAccess();
        areaAccess = new SpecAreaAccess();
    }
    public boolean enter(String userID){
       return buildingAccess.enter(userID);
    }
    public boolean exit(String userID) {
        return buildingAccess.exit(userID);
    }
    public Iterable<String> getUsersInside()
    {
        return buildingAccess.getUsersInside();
    }
    public boolean canAccess(String userID, int areaID)
    {
        if (buildingAccess.isPersonInBuilding(userID))
        {
            return areaAccess.canAccess(userID, areaID);
        }
        else
        {
            System.out.println("ERROR: User "  +userID+ " has not entered the main door, and therefore cannot enter area "+areaID+"!");
            return false;
        }

    }
    public void grantAccess(String userID, int areaID)
    {
        areaAccess.grantAccess(userID, areaID);
    }
    public void revokeAccess(String userID, int areaID)
    {
        areaAccess.revokeAccess(userID, areaID);
    }
}
