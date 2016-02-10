import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
   A coin with no monetary value.
*/
public class Person implements Comparable<Person>
{
    private String name;

    /**
       Constructs a coin.
       @param aValue the monetary value of the coin
       @param aName the name of the coin
    */
    public Person(String aName) 
    {  
       name = aName;
    } 

    /**
       Gets the coin name.
       @return the name
    */
    public String getName() 
    {
       return name;
    }
   
    public int compareTo(Person other)
    {
        return name.compareTo(other.name);
        
    }
    
    public String toString()
    {
        return "Name: "+name;   
    }
    
    public static void main()
    {
        ArrayList<Person> list=new ArrayList<Person>();
        Scanner in=new Scanner(System.in);
        System.out.println("Input 10 names.");
        for(int i=0;i<10;i++)
        {
            System.out.println("Name #"+(i+1));
            list.add(new Person(in.next()));
        }                     
        System.out.println("original list: "+list);
        Collections.sort(list);
        System.out.println("sorted list: "+list);
        System.out.println("First in list: "+list.get(0));
        System.out.println("Last in list:"+list.get(9));
    }
}
