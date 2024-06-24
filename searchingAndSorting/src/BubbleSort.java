// Bubble Sort....


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {34,34,23,435,54,34,54,34};
        sorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sorting(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
