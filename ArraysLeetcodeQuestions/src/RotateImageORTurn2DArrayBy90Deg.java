import java.util.Arrays;

public class RotateImageORTurn2DArrayBy90Deg {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        solution(arr);
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


    static void solution(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0; i<matrix.length; i++){
            int start = 0;
            int end = matrix[i].length-1;
            while (start<=end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

    }
}
