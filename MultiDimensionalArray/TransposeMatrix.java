package MultiDimensionalArray;
import java.util.Scanner;
public class TransposeMatrix {

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    static int[][] findTransposeMatrix(int[][] matrix,int row,int column){

        int[][] ans = new int[column][row];

        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column : ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];

        int totalElements = row*column;
        System.out.println("Enter "+totalElements+" elements");


        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrics");
        printMatrix(matrix);

        System.out.println("After The print matrix");
        int[][] ans = findTransposeMatrix(matrix, row, column);
        printMatrix(ans);


    }
    
}
