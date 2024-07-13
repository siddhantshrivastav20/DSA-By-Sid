// Coin change problem
public class CoinChange {
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int amount = 11;
        int ans = solutionOfCoinChange(coins, amount);
        if(ans == Integer.MAX_VALUE){
            System.out.println(ans);
        }else {
            System.out.println(ans);
        }
    }

    static int solutionOfCoinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int minAns = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            if (coin <= amount) {
                int recursionAns = solutionOfCoinChange(coins, amount - coin);
                if(recursionAns != Integer.MAX_VALUE){
                    int coinUsed = 1 + recursionAns;
                    minAns = Math.min(minAns, coinUsed);
                }
            }
        }
        return minAns;
    }

}
