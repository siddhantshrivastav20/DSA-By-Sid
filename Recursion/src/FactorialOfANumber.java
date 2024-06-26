// Find Factorial of a number using recursion..

public class FactorialOfANumber {
    public static void main(String[] args){
        int num = 7;
        int ans = factorial(num);
        System.out.println(ans);
    }

    static int factorial(int num){

        if(num == 0 || num == 1){
            return 1;
        }
        int fact = num * factorial(num-1);
        return fact;

    }
}
