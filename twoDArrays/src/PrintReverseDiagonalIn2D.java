public class PrintReverseDiagonalIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,34},
                {5,80,7,8},
                {9,25,20,12},
                {13,76,15,16}};

        printReverseDiagonal(arr);
    }

    static void printReverseDiagonal(int[][] arr){
        int revCount = 0;
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i][revCount]+" ");
            revCount++;
        }
    }
}
