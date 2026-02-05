package StringSolution;

import java.util.Arrays;

public class CoinChangeMinCoins {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int amount = 4;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        int result = dp[amount] > amount ? -1 : dp[amount];
        System.out.println("Min coins needed: " + result);  // Output: 2 (e.g., 2 + 2)
    }
}

