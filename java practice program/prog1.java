




// Problem Statement – Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the fuel consumption and display it in the format (liters per 100 kilometers).

// Convert the same result to the U.S. style of miles per gallon and display the result. If the quantity or distance is zero or negative display ” is an Invalid Input”.

// [Note: The US approach of fuel consumption calculation (distance / fuel) is the inverse of the European approach (fuel / distance ). Also note that 1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]

// The result should be with two decimal place.To get two decimal place refer the below-mentioned print statement :









import java.util.*;
import java.text.*;
class Main{

  public static void main (String[] args) {
      DecimalFormat df2 =new DecimalFormat("0.00");
      Scanner sc= new Scanner (System.in);

      System.out.println("Enter the no of liters to fill the tank");
      int ltt =sc.nextInt();
      double lt= (ltt*1.00);

      if(ltt<1){
          System.out.println(ltt+" is an Invalid Input");
          System.exit(0);
      }
      System.out.println("Enter the distance covered");
      int diss =sc.nextInt();
      double dis= (diss*1.00);

      if(diss<1){
          System.out.println(diss+" is an Invalid Input");
          System.exit(0);
      }
      
      double hundered = ((lt/dis)*100);
      System.out.println("Liters/100KM");
      System.out.println(df2.format(hundered));

      double miles = (dis*0.6214);
      double gallons =(lt*0.2642);
      double mg = miles/gallons;
      System.out.println("Miles/gallons");
      System.out.println(df2.format(mg));
  }  
}