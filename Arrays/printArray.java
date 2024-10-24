package Arrays;

public class printArray {

    public static void main(String[] args) {
          
        int n[] = {56,89,65,32,53,16,48,58,89};
        int count = 0;
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+" ");
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
}