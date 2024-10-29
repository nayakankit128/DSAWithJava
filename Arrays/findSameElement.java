package Arrays;

public class findSameElement {
    public static void main(String[] args) {
        
        int arr[] = {45,84,43,96,93,65,45,84,56,12};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print("Duplicate element : "+arr[i]);
                }
            }
        }
    }
}
