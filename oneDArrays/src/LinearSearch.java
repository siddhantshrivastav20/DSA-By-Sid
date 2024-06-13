import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element to find in array: ");
        int[] arr = {23,34,23,45,654,34};
        int target = sc.nextInt();
        boolean result = linearSearchArr(arr,target);
        System.out.println(result);

    }


    static boolean linearSearchArr(int[] arr, int target){
        for(int i =0; i<=arr.length-1; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
