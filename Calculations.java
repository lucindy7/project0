package project0;

import java.util.Scanner;

public class Calculations
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int num1 = kb.nextInt();

      System.out.print("Enter a second number: ");
      int num2 = kb.nextInt();

      kb.nextLine();

      System.out.print("Enter a string: ");
      String str1 = kb.nextLine();

      System.out.print("Enter a second string: ");
      String str2 = kb.nextLine();

      System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)
                         + "\n" + num1 + " - " + num2 + " = " + (num1 - num2)
                         + "\n" + num1 + " * " + num2 + " = " + (num1 * num2)
                         + "\n" + num1 + " / " + num2 + " = " + (num1 / num2)
                         + "\n" + num1 + " % " + num2 + " = " + (num1 % num2)
                         + "\n" + num1 + " / " + num2 + " = "
                         + ((double) num1 / num2));

      System.out.println("First word, uppercase: " + str1.toUpperCase()
                         + "\n" + "Second word, lowercase: " + str2.toLowerCase()
                         + "\n" + "First characters: " + str1.charAt(0)
                         + " and " + str2.charAt(0)
                         + "\n" + "Last characters: " + str1.charAt(str1.length() - 1)
                         + " and " +  str2.charAt(str2.length() - 1));
   }
}