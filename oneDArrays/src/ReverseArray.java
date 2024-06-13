// Reverse an array

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {10,27,423,2,23,32,34};
//        reverseAnArray(arr);

//        int[] ans = reverseAnArray2(arr);
//        System.out.println(Arrays.toString(ans));

        reverseAnArray3(arr);
    }

    // Method-1
    static void reverseAnArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(end>start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }


    // Method -2
    static int[] reverseAnArray2(int[] arr){
        int[] temp = new int[arr.length];
        int n = arr.length-1;
        for(int i =n; i>=0; i--){
            temp[n-i] = arr[i];
        }
        return temp;
    }



    // Method- 3

    static void reverseAnArray3(int[] arr){
        for(int start=0, end=arr.length-1; start<=end; start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
