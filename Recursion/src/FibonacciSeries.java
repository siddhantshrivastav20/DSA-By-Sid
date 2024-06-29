public class FibonacciSeries {
    public static void main(String[] args){
        int term = 4;
        int printAns = fibonacci(term);
        System.out.println(printAns);
    }

    static int fibonacci(int term){
        if(term == 0 || term == 1){
            return term;
        }

        int ans = fibonacci(term-1)+fibonacci((term-2));
        return ans;
    }
}
