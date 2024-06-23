// https://leetcode.com/problems/sqrtx/description/

// Find Square root without using inbuilt function..

public class SquareRoot {
    public static void main(String[] args){
        long x =68;
        long ans =findSqrt(x);
        System.out.println(ans);
    }

    static long findSqrt(long x){
        long start =0;
        long end = x;
        long ans =-1;

        while(start<=end){
            long mid = start +(end -start)/2;
            if(mid*mid == x){
                return mid;
            }else if(mid*mid < x){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
