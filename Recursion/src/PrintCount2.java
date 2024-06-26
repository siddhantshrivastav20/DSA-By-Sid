public class PrintCount2 {
    public static void main(String[] args){
        int num = 10;
        printCounting(num);
    }

    static void printCounting(int num){
        if(num == 0){
            return;
        }
        printCounting(num-1);
        System.out.println(num);

    }
}
