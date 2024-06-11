// Shift array's element by 2....


import java.util.Arrays;

public class ShiftArrayElementBy2 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40};
        int[] ans =shiftElementBy2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] shiftElementBy2(int[] arr){
        int[] temp = {arr[arr.length-1], arr[arr.length-2]};
        for(int i=arr.length-1; i>1; i--){
            arr[i] = arr[i-2];
        }

        arr[0] = temp[1];
        arr[1] = temp[0];
        return arr;
    }
}
