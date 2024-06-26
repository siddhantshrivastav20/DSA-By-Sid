// Print reverse counting using recursion....

public class PrintCounting {
    public static void main(String[] args){
        int num = 10;
        counting(num);

    }

    static void counting(int num){
        if(num == 0){
            return;
        }

        System.out.println(num);
        counting(num-1);
    }
}
