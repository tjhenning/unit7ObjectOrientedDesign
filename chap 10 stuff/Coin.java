import java.util.ArrayList;
import java.util.Collections;


/**
   A coin with no monetary value.
*/
public class Coin implements Comparable<Coin>
{
    private double value;
    private String name;

    /**
       Constructs a coin.
       @param aValue the monetary value of the coin
       @param aName the name of the coin
    */
    public Coin(double aValue, String aName) 
    { 
       value = aValue; 
       name = aName;
    }

    /**
       Gets the coin value.
       @return the value
    */
    public double getValue() 
    {
       return value;
    }

    /**
       Gets the coin name.
       @return the name
    */
    public String getName() 
    {
       return name;
    }
   
    public int compareTo(Coin otherCoin)
    {
        //Coin otherCoin=(Coin) other;//this is bad dont do this
        return (int)(50*(this.value-otherCoin.value));
    
    }
    
    public String toString()
    {
        return "Name: "+name+"  Value: "+value;   
    }
    
    public static void main()
    {
        ArrayList<Coin> list=new ArrayList<Coin>();
        list.add(new Coin(.1,"dime"));
        list.add(new Coin(.25,"quarter"));
        list.add(new Coin(.01,"penny"));
        list.add(new Coin(.05,"nickel"));
        
        System.out.println("original list: "+list);
        Collections.sort(list);//cuz sort is static
        System.out.println("sorted list: "+list);
        
        
    }
}
