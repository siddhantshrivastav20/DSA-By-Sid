// Calculate sum of all rows in 2D array..

import java.util.Arrays;

public class SumOfRowsIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,34},
                {5,80,7,8},
                {9,25,20,12},
                {13,76,15,16}};
        int row = 4;
        int col = 4;

        int[] ans = sumOfRows(arr,row,col);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumOfRows(int[][] arr,int row, int col){
        int[] temp = new int[col];
        int pointer = 0;
        int sum = 0;
        for(int i=0; i<col; i++){
            sum = 0;
            for(int j=0; j<col; j++){
                sum = sum + arr[i][j];
            }
            temp[pointer] = sum;
            pointer++;

        }
        return temp;
    }
}
