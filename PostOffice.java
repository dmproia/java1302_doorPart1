/**
 * Write a description of class PostOffice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostOffice
{
    private Door[] door;
    
    public PostOffice()
    {
        door = new Door[101];
        for(int i = 1; i<101; i++)
        {
            door[i] = new Door("closed");
        }
    }     
}