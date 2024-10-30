package DigitProgramming;

import java.util.Scanner;

public class sumOfDigits {

    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number do you want to sum : ");
        int n = sc.nextInt();

        int digit = 0;
        int sum = 0;

        while (n != 0) {

         //access the last element of givien number  
         digit = n%10;
        
         sum = sum + digit;

         //reduce the number
         n = n/10;
            
        }

        System.out.println("sum og Digit : "+sum);

    }
    
}
