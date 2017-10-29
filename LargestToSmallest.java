import java.util.Scanner;

public class LargestToSmallest
{
   public static void main(String[] args)
   {
      boolean end = false;
      int Largest;
      int Smallest;
      int HoldNum; 
      Scanner reader = new Scanner(System.in);
      HoldNum = 0;
      
      System.out.println("Please input a number. (Insert -99 to go to the results)");
      HoldNum = reader.nextInt();
      Largest = HoldNum;
      Smallest = HoldNum;
      do
      {
         System.out.println("Please input a number. (Insert -99 to go to the results)");
         HoldNum = reader.nextInt();
         if(HoldNum == -99)
         {
            end = true;
         }else if(HoldNum > Largest)
         {
            Largest = HoldNum;
         }else if(HoldNum < Smallest)
         {
            Smallest = HoldNum;
         }
      }while(end == false);
      System.out.println("Your Largest Number was " + Largest);
      System.out.println("Your Smallest Number was " + Smallest);
      
   }
}