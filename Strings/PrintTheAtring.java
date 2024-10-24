package Strings;

public class PrintTheAtring {
    

    public static void main(String[] args) {
        
     String str = "Hello what's up";

    int count = 0;
     for(int i=0; i<str.length(); i++){
        System.out.print(str.charAt(i)+" ");
        count++;
     }
     System.out.println();
     System.out.println(count);
    }
}
