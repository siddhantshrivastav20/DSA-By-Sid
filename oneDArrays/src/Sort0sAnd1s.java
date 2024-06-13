// Sort all 0s and 1s...


import java.util.Arrays;

public class Sort0sAnd1s {
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,0,1,1,0,1,0};
        int[] ans = sortZerosAndOnes(arr);
        System.out.println(Arrays.toString(ans));


    }

    static int[] sortZerosAndOnes(int[] arr){
        int zeros = 0;
        int ones = 0;

        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }else{
                ones++;
            }
        }

        for(int i=0; i<zeros; i++){
            temp[i] = 0;
        }
        for(int i=0; i<ones; i++){
            temp[i] = 1;
        }
        return temp;
    }
}
