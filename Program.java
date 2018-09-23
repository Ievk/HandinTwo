import java.util.HashSet;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        AccessControl access;
       Iterable<String> users;
        Random rnd;
        access = new AccessControl();
      /*   boolean canEnter = access.enter("Alice");
        System.out.println(canEnter);
        boolean canEnterTwice = access.enter("Alice");
        System.out.println(canEnterTwice);
        boolean canExit = access.exit("Alice");
        System.out.println(canExit);
        boolean canExitIeva = access.exit("Ieva");
        System.out.println(canExitIeva);
        boolean canIeva = access.enter("Ieva");

        System.out.println(access.getUsersInside());*/

        access.enter("Alice");
        access.grantAccess("Alice", 0);
        access.revokeAccess("Alice", 0);
        System.out.println("Calling canAccess with a entered user with revoked access returns " + access.canAccess("Alice", 0));
        System.out.println();
    }
}
