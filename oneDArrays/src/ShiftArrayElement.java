// Shift array's element by 1...


import java.util.Arrays;

public class ShiftArrayElement {
    public static void main(String[] args){
        int[] arr = {1,2};
        int[] ans =shiftElement(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shiftElement(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int lastEle = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastEle;
        return arr;
    }
}
