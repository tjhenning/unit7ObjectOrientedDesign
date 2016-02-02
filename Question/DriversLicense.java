public class DriversLicense extends Card
{
    private String expirationYear="";
    public DriversLicense(String n, String id)
    {  
        super(n);
        expirationYear = id;
        Integer.parseInt(expirationYear);
    }
     public String format()
    {
        return super.format()+" Expiration Year: "+expirationYear;      
    }
    public boolean isExpired()
    {       
        if(2016<=Integer.parseInt(expirationYear))
        {
            return false;
        }
        return true;
    }
    public boolean equals(DriversLicense card)
    {
        if (expirationYear==card.expirationYear&&getName()==card.getName())
        {
            return true;
        }
        return false;
    }
}