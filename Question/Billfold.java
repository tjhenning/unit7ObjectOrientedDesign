public class Billfold
{
    private Card card1;
    private Card card2;
    public Billfold()
    {}
    
    public void addCard(Card card)
    {
        if (card1==null)
        {
            card1=card;
        }
        else if (card2==null)
        {
            card2=card;
        }
    }
    public String formatCards()
    {
        String retrn="[";
        if (card1!=null)
        {
            retrn+=card1.format();
        }
        retrn+="|";
         if (card2!=null)
        {
            retrn+=card2.format();
        }
        retrn+="]";
        return retrn;
    }
    public int getExpiredCardCount()
    {
        int expired=0;
        if (card1!=null)
        {
            if (card1.isExpired())
            {
                expired++;
            }
        }
        if (card2!=null)
        {
            if (card2.isExpired())
            {
                expired++;
            }
        }
        return expired;
    }
        
    public static void test()
    {
        Billfold bill=new Billfold();
        bill.addCard(new DriversLicense("name","2016"));
        bill.addCard(new CallingCard("name","number","pin"));
        System.out.println(bill.formatCards());
        System.out.println(bill.getExpiredCardCount());
    }
    public static void test2()
    {
        Billfold bill=new Billfold();     
        CallingCard card=new CallingCard("name","number","pin");
        System.out.println(card.equals(new CallingCard("name","number","pin")));
    }
}

