// Transpose of a matrix...

public class TransposeMatrix {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,34},
                {5,80,7,8},
                {9,25,20,12},
                {13,76,15,16}};

//        transposeOfMatrix(arr);

        // Method 2 optimized
        transpose2DMatrix(arr);

        // Printing 2D Array

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }

    static void transposeOfMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    // Using swap method...

    static int[][] transpose2DMatrix(int[][] arr){
        for(int i =0; i< arr.length; i++){
            for(int j=i; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
}
