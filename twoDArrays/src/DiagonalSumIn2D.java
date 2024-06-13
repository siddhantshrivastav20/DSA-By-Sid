// Print diagonal in 2D array

public class DiagonalSumIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,34},
                {5,80,7,8},
                {9,25,20,12},
                {13,76,15,16}};

        int ans = sumDiagonal(arr);
        System.out.println(ans);
    }

    static int sumDiagonal(int[][] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i][i];
        }
        return sum;
    }
}
