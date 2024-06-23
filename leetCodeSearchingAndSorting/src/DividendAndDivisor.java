// Given two integers one is a dividend and the other is the divisor,
// we need to find the quotient when the dividend is divided by the divisor without the use of any /" and "%" operators "
// Input: dividend = 10, divisor = 2
// Output: 5

// Explanation: 10/2 = 5.
// Input: dividend = 10, divisor = 3

// Output: 3

// Explanation: 10/3 = 3.33333... which is truncated to 3.
// Input: dividend = 10, divisor = -2
// Output: -5
// Explanation: 10/-2 = -5

import static java.lang.Math.abs;

public class DividendAndDivisor {
    public static void main(String[] args){
        int dividend = 10;
        int divisor = -2;
        int answer = solveDividendAndDivisor(abs(dividend), abs(divisor));
        if(divisor < 0 || dividend < 0){
            System.out.println(-answer);
        }
    }

    static int solveDividendAndDivisor(int dividend, int divisor){
        int start = 0;
        int end = 10;
        int mid = start+((end-start)>>1);
        int ans = -1;

        while(start<=end){
            if(divisor* mid == dividend){
                return mid;
            }else if(divisor*mid < dividend){
                ans = mid;
                start = mid+1;
            }else if(divisor*mid > dividend){
                end = mid-1;
            }
            mid = start+((end-start)>>1);
        }
        return ans;
    }
}
