// Total sum of reverse Diagonal in 2D array...

public class ReverseDiagonalIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,34},
                {5,80,7,8},
                {9,25,20,12},
                {13,76,15,16}};

        int ans = reverseSumDiagonal(arr);
        System.out.println(ans);
    }

    static int reverseSumDiagonal(int[][] arr){
        int revCount = 0;
        int sum = 0;
        for(int i=arr.length-1; i>=0; i--){
            sum = sum + arr[i][revCount];
            revCount++;
        }
        return sum;
    }
}
