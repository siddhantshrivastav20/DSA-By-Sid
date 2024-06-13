// Create a 2D array of 100 rows and 50 columns..

public class Create2dArrayWithGivenRowCol {
    public static void main(String[] args){
        int[][] arr = new int[100][50];


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
