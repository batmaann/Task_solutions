package org.example;

import java.util.Arrays;

public class Task3 {


    /*
    Вам дан массив цен prices,
    где prices[i] - это цена определенной акции в i-й день.
    Вы хотите максимизировать свою прибыль,
    выбрав один день для покупки акций и выбрав другой день в будущем для их продажи.
    Верните МАКСИМАЛЬНУЮ прибыль,
    которую вы можете получить от этой сделки.
    Если вы не можете получить никакой прибыли, верните 0.


    Ввод: prices = {7,1,5,3,6,4}
    Вывод: 5
    Объяснение: Покупка во второй день (цена = 1) и продажа в пятый день (цена = 6), прибыль = 6-1 = 5.
    Обратите внимание,
    что покупка во второй день и продажа в первый день не допускается,
    потому что вы должны купить перед тем, как продавать.


     */


    public static int maxProfitDecision1(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        System.out.println("максимальный профит это  " + op );
        return op;
    }


    public static int maxProfitDecision2(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;

        for (int i = 1; i < prices.length; i++) {
            maxprof = Math.max(maxprof, prices[i] - min_price);
            min_price = Math.min(prices[i], min_price);
        }

        System.out.println("максимальный профит это  " + maxprof );
        return maxprof;
    }


}
