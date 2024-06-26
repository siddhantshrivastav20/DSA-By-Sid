public class PowerOf2 {
    public static void main(String[] args){
        int power = 10;
        int ans = powerOfTwo(power);
        System.out.println(ans);
    }

    static int powerOfTwo(int power){
        if(power == 0){
            return 1;
        }
        int calculate_power = powerOfTwo(power-1);
        return (int) (Math.pow(2,calculate_power));

    }
}
