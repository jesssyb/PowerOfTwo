/*
Jessica Bresnahan
Created: 9/3/2021
Updated: 9/4/2021; Added error check for input
Description: Program asks for an int input, calculates, and returns an output of whether or not int inputted is a power of two*/

import java.util.Scanner;

public class PowerOfTwo
{
   public static void main(String [] args)
   {
      int num = -1, mod = 0;
      boolean ToF = true;
      num = getNum(num);
      ToF = getPowerOfTwo(num, mod, ToF);  
      output(num, ToF);    
   }
   
   public static int getNum(int num)
   {
      Scanner input = new Scanner(System.in);
      while(num < 0)
      {
         System.out.print("Enter a positive integer: ");
         num = input.nextInt();
      }
      return num;
   }
   
   public static boolean getPowerOfTwo(int num, int mod, boolean ToF)
   {
      while (num > 1)
      {
         mod = num % 2;
         if (mod != 0)
            ToF = false;
         num/=2;
      }
      return ToF;
   }
   
   public static void output(int num, boolean ToF)
   {
      if(ToF == true)
      {
         System.out.println("\n" + num + " is a power of 2");
      }
      
      else
      {
         System.out.println("\n" + num + " is not a power of 2");
      }

   }
}