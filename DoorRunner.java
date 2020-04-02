
/**
 * Write a description of class DoorRunner here.
 * 
 * @author (David Proia) 
 * @version (a version number or a date)
 */
public class DoorRunner
{
    public static void main(String[] args)
    {
        Door frontDoor = new Door();
        //Door backDoor = new Door("closed","locked");
        System.out.println(frontDoor);
        //System.out.println(backDoor);
        frontDoor.setState("open");
        //frontDoor.setLockState("locked");
        System.out.println(frontDoor.getState());
        frontDoor.setState("closed");
        System.out.println(frontDoor.getState());
        
    }
}