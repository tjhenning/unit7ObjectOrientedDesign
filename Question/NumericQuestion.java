
import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class NumericQuestion extends Question
{
   private double answer;
    
   public void setAnswer(double correctResponse)
   {
       answer=correctResponse;
    }
    
   public boolean checkAnswer(String response)
   {
       return (.01>Math.abs(Double.parseDouble(response)-answer));
   }
}
