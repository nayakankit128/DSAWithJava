package DigitProgramming;
import java.util.Scanner;;
public class PrimeNumberBetweenTwoNumber {

    public static void main(String[] args) {
        
        System.out.print("Enter Two Number : ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int i,j;
        for(i=num1; i<=num2; i++){
            for(j=2; j<=i; j++){
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.print(" "+j);
        }
    }
    
}
