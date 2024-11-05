package Java8Features;

import java.util.ArrayList;
public class LambdaExpression {

    public static void main(String args[]){

   ArrayList<Integer> num = new ArrayList<>();
   num.add(101);
   num.add(201);
   num.add(301);
   num.add(401);
   num.add(501);

   //print all the elements using lambda expression
   num.forEach( (n) -> System.out.println(n));

    }
}
