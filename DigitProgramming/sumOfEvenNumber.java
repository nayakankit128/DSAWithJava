package DigitProgramming;
import java.util.Scanner;

public class sumOfEvenNumber {
    public static void main(String[] args) {
        
      Scanner sc1 = new Scanner(System.in);
      System.out.print("Enter The Digits do you want sum only even number : ");

      int n = sc1.nextInt();

      int digit = 0;
      int sum = 0;

      while (n !=0) {
        digit = n%10;

        if(digit%2 == 0)
        sum = sum + digit;
        n = n/10;
      }

      System.out.println("Sum of Even Number : "+sum);
    }
}
