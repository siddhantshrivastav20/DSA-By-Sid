// Bubble Sort....


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {34,34,23,435,54,34,54,34};
        sorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sorting(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
