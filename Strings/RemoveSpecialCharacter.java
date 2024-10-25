package Strings;

public class RemoveSpecialCharacter {
    public static void main(String args[]){

        String str = "jav&^a%$progra#@mming*!";

        String s = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("After the String behavior of removing the special character :");
        System.out.println(s);

    }
}
