import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class QuestionDemo1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      FillInQuestion q = new FillInQuestion();
      q.setText("The creater of Java is _James Gosling_");
      //q.setAnswer("James Gosling");      

      q.display();
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}

