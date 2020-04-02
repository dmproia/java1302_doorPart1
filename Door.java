/**
 * Write a description of class Door here.
 * 
 * @author (David Proia) 
 * @version (6-13-2013)
 */
public class Door
{
    private String state;
    
    
    //method for using Door()
    public Door ()
    {
        state = "closed";                      
    }
    //method for using door calling 2 variable's
    public Door(String s)
    {        
        if (s.equals("open"))
        {
            state = s;
        }
        else
        {
            state = "closed";
        }
        
                           
    }

    public void setState(String s)
    {
        if (s.equals("open"))
        {
            state = s;
        }
        
        else
        {
            state = "closed";
        }        
    }
    
    public String getState()
    {
        return state;
    }
        
    //Mutator for visit
    public void visit()
    {
        if (state.equals("closed"))
        {
            state = "open";
        }
        else if(state.equals("open"))
        {
            state = "closed";
        }
        
       
    }
    
    public String toString()
    {
        return  state ;
    }

}