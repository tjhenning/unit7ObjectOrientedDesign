
public class CallingCard extends Card
{
    private String cardNumber="";
    private String PIN="";
    public CallingCard(String n, String id, String pin)
    {  
        super(n);
        cardNumber = id;
        PIN=pin;
    }
    public String format()
    {
        return super.format()+" PIN: "+PIN+" Card Number: "+cardNumber;        
    }
    public boolean equals(CallingCard card)
    {
        if (cardNumber==card.cardNumber&&PIN==card.PIN&&getName()==card.getName())
        {
            return true;
        }
        return false;
    }
}