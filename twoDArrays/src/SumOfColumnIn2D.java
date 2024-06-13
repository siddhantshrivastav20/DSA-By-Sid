import java.util.Arrays;

public class SumOfColumnIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,34},
                {5,80,7,8},
                {9,25,20,12},
                {13,76,15,16}};
        int row = arr.length;
        int col = arr[row-1].length;

        int[] ans = sumOfCol(arr,row,col);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumOfCol(int[][] arr, int row, int col){

        int[] temp = new int[arr.length];
        int pointer = 0;

        int sum = 0;
        for(int i=0; i< col; i++){
            sum = 0;
            for(int j=0; j<row; j++){
                sum = sum + arr[j][i];
            }
            temp[pointer] = sum;
            pointer++;
        }
        return temp;
    }
}
