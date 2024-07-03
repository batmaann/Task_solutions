package org.example;

public class Task5 {
    /*
    Дан массив целых чисел nums.
    Верните третье по величине уникальное число в этом массиве.
    Если третьего максимального числа не существует, верните максимальное число.
    Input: nums = [3,2,1]
    Output: 1
    Первый различный максимум - 3.
    Второй различный максимум - 2.
    Третий различный максимум - 1.
     */
    public static int thirdMaxDecision1(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;

    }


}
