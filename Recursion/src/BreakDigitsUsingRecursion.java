public class BreakDigitsUsingRecursion {
    public static void main(String[] args){
        int num = 389;
        int rem = 0;
        breakDigit(num);
    }

    static void breakDigit(int num){
        if(num == 0){
            return;
        }
        int rem = num%10;
        breakDigit(num/10);
        System.out.print(rem+" ");
    }
}
