// Write a code to move negative element on left side and positive element on right side..

import java.util.Arrays;

public class NegativeLeftPositiveRight {
    public static void main(String[] args){
        int[] arr= {0,-10,2,3,-43,-54,33,-34};
        negativePositive(arr);
        System.out.println(Arrays.toString(arr));

        int[] ans =basicNegativePositive(arr);
        System.out.println(Arrays.toString(ans));
    }

    // Time Complexity O(n)  // Optimized method
    static void negativePositive(int[] arr){
        int pointer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
        }

    }

    // Another basic method...

    static int[] basicNegativePositive(int[] arr){
        int[] temp = new int[arr.length];
        int pointer = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                temp[pointer] = arr[i];
                pointer++;
            }
        }

        for(int i=pointer; i<arr.length; i++){
            temp[pointer] = arr[i];
            pointer++;
        }

        return temp;
    }
}
