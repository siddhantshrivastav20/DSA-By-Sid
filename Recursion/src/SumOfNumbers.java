public class SumOfNumbers {
    public static void main(String[] args){
        int n =10;
        int printAns = sum(n);
        System.out.println(printAns);

    }

    static int sum(int num){
        if(num == 0){
            return num;
        }
        int ans = num + sum(num-1);
        return ans;
    }
}
