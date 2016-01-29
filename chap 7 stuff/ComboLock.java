

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    /** description of instance variable x (add comment for each instance variable) */
    private int code;
    private int code2;
    private int code3;
    public int selection=0;
    private int progress=0;
      
    public ComboLock(int secret1,int secret2,int secret3)
    {
        code=secret1;
        code2=secret2;
        code3=secret3;
    }

    public void reset()
    {
        selection=0;
        progress=0;        
    }
    public void turnRight(int units)
    {
        selection+=units;
        selection=selection%40;
        if (selection==code&&progress==0)
        {
            progress=1;
        }
        if (selection==code3&&progress==2)
        {
           progress=3; 
        }
    }
    public void turnLeft(int units)
    {
        selection-=units;
        if (selection<0)
        {
            selection+=40;
        }        
        if (selection==code2&&progress==1)
        {
            progress=2;
        }       
    }
    public boolean open()
    {
        return (progress==3);
    }
}
