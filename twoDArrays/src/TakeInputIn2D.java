// Code for taking input in 2D array...

import java.util.Scanner;

public class TakeInputIn2D {
    public static void main(String[] args){
        int[][] arr = new int[3][4];
        int row = 3;
        int col = 4;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Row: "+i+ " , Col: "+j);
                arr[i][j] = sc.nextInt();
            }
        }


        // Print 2D array
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
