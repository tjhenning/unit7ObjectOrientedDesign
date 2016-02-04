
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
        if (cardNumber.equals(card.cardNumber)&&PIN.equals(card.PIN)&&super.getName().equals(card.getName()))
        {
            return true;
        }
        return false;
    }
//     public boolean equals2(Object other)
//     {
//         if(getClass()==other.getClass())
//         {
//             CallingCard otherCard=(CallingCard) other;
//             boolean isEqual=super.equals(otherCard);
//             return;
//         }
//         return false;
//     }
}