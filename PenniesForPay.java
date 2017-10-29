import java.util.Scanner;

public class PenniesForPay
{
   public static void main(String[] args)
   {
      Scanner reader = new Scanner(System.in);
      int Day;
      double Pennies = 0.01;
      double PenniesHold;
      double Dollars = 0;
      double DollarsHold;
      int Duration;
      double Total = 0;
      double TotalHold;
      System.out.println("How long is your pay period?");
      System.out.println("(Please insert your Duration in Days)");
      Duration = reader.nextInt();
      
      for(Day = 1; Day <= Duration; Day++)
      {
         if(Day == 1)
         {
            Pennies = 0.01;
            PenniesHold = Pennies;
            DollarsHold = PenniesHold;
         }
         else
         {
            PenniesHold = Pennies + Pennies;
            Pennies = PenniesHold;
            Dollars = Pennies;
         }
         
         TotalHold = Total;
         Total = TotalHold + Dollars;
         System.out.println("$" + Dollars + " | Day " + Day);
         System.out.println(Pennies);
      }
      System.out.println("Total Amount Earned: " + Total);
   }
}