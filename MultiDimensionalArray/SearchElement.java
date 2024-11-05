package MultiDimensionalArray;

import java.util.Scanner;

public class SearchElement {



    public static boolean search(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
              if(matrix[i][j] == key){
                System.out.println("Element found ( "+i+","+j+" )");
                return true;
              }
            }
            
        } 
        System.out.println("Element not found");
        return false;
    }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int matrix[][] = new int[3][4];

    int n = matrix.length,m = matrix[0].length;
    // taking input from the user
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();
        }
    }



    System.out.println("Output is Here ");
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    } 

    search(matrix, 8);
  }
}
