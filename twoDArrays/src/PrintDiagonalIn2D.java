// Print diagonal element in 2D array...

public class PrintDiagonalIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,34},
                {5,80,7,8},
                {9,25,20,12},
                {13,76,15,16}};
        printDiagonal(arr);
    }


    static void printDiagonal(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] [i]);
        }
    }
}
