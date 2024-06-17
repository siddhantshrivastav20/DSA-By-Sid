// https://leetcode.com/problems/missing-number/description/


public class MissingNumbers {
    public static void main(String[] args){
        int[] arr = {3,0,1};
        int ans = solution(arr);
        System.out.println(ans);
    }

    static int solution(int[] arr){
        int n = arr.length;
        int formula = ((n)*(n+1))/2;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        int ans = formula -sum;
        return ans;
    }
}
