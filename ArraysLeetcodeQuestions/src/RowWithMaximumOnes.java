// https://leetcode.com/problems/row-with-maximum-ones/submissions/1290698774/

import java.util.Arrays;

public class RowWithMaximumOnes {
    public static void main(String[] args){
        int[][]  arr= {{0,1},{1,0}};
        int[] ans = solution(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] solution(int[][] mat){
        int[] ans = new int[2];
        int count = 0;
        for(int i=0; i<mat.length; i++){
            count =0;
            for(int j = 0; j< mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count>ans[1]){
                ans[1] = count;
                ans[0] = i;
            }
        }
        return ans;
    }
}
