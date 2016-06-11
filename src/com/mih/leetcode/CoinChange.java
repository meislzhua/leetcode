package com.mih.leetcode;

/**
 * Created by hack on 16/6/11.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        if(amount == 0) return 0;
        int[] amounts = new int[amount+1];
        for (int i = 1; i <= amount; i++) {
            amounts[i] = -1;
            for (int coin : coins) {
                if (coin > i) continue;
                if (coin == i) {
                    amounts[i] = 1;
                    continue;
                }
                if(amounts[i - coin] == -1) continue;
                if(amounts[i] == -1){
                    amounts[i] = amounts[i - coin] + 1;
                } else {
                    amounts[i] = Math.min(amounts[i],amounts[i - coin] + 1);
                }
            }
        }
        return amounts[amount];
    }

    public static void main(String[] args) {
        System.out.println(new CoinChange().coinChange(new int[]{1,3,5},11));
    }

}
