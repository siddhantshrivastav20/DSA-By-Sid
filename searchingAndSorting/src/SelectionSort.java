// Selection Sort....

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSorting(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int minValue = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[minValue]> arr[j]){
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }
}
