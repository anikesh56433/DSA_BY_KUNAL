package StringSolution;

public class CoinChangeWays {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3,4,5,6,7,8,9};
        int amount = 100;

        int[] dp = new int[amount + 1];
        dp[0] = 1;  // Base case

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = dp[i]+ dp[i - coin];
            }
        }

        System.out.println("Total Ways = " + dp[amount]);
    }
}
