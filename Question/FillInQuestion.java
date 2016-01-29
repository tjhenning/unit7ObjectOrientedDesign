import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class FillInQuestion extends Question
{    
   public void setText(String questionText)
   {
       Scanner parser=new Scanner(questionText);
       parser.useDelimiter("_");
       String question=parser.next();
       String answer=parser.next();
       question+="_______";//+parser.next();
       
       super.setText(question);
       setAnswer(answer);
    }  
}