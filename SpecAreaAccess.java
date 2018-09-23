import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SpecAreaAccess
{
    private HashMap<String, HashSet<Integer>> accessRights;

    public SpecAreaAccess()
    {
        accessRights= new HashMap<>();
    }

    public boolean canAccess(String userID, int areaID) {
        // if(accessRightsTest.containsKey(userID) && accessRightsTest.get(userID).equals(areaID)){
        if (accessRights.containsKey(userID))
        {
            HashSet<Integer> personsAccessRights = accessRights.get(userID);
            boolean hasAccessRights = personsAccessRights.contains(areaID);
            if (hasAccessRights){
                return true;
            }
        }

        System.out.println("ERROR: User " + userID + " does not have access privileges to area "+areaID+"!");
        return false;

    }
    public void grantAccess(String userID, int areaID)
    {
        if (accessRights.containsKey(userID))
        { //we checked if user Id is already in HashMap, and therefore we can add his area ID to his HashSEt
            HashSet<Integer> personsAccessRights = accessRights.get(userID);
            personsAccessRights.add(areaID);
        }
        else
        {//if this is the first time we give user the access and he is therefore not in the HashMap, we put him in it together with a new HasSet that contains his area access rights
            HashSet<Integer> personsAccessRights = new HashSet<>();
            personsAccessRights.add(areaID);
            accessRights.put(userID, personsAccessRights);

        }
    }
    public void revokeAccess(String userID, int areaID)
    {
        if (accessRights.containsKey(userID))
        { //
            HashSet<Integer> personsAccessRights = accessRights.get(userID);
            personsAccessRights.remove(areaID);
            if (personsAccessRights.size()==0)
            {
                accessRights.remove(userID);
            }
        }




    }
}
