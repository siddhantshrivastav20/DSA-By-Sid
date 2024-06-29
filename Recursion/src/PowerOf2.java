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

        int ans = 2* powerOfTwo(power-1);
        return ans;

    }
}
