public class CelciusToFahrenhiet
{
   public static void main(String[] args) 
   {
      double F;
      double C;
      
      for(C = 0; C <= 20; C++)
      {
         F = 1.8 * C + 32;
         System.out.println("Celcius: " + C + " | Fahrenhiet: " + F);
      }
   }
}