package org.example;

import java.util.Arrays;

public class Task2 {
    // dddeeeklln -> 3d3e1k2l1n
    //одну строку перевести в формат
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Дан массив целых чисел nums и целое число target.
    Вернуть индексы двух чисел в массиве, сумма которых равна target.
    Можно предположить, что каждый входной массив имеет ровно одно решение,
    и нельзя использовать один и тот же элемент дважды.
    Ответ можно вернуть в любом порядке.



     */
//    int[] nums = {2,7,11,15};
//    int target = 9;

    public static int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        System.out.println("найдены элементы это  "+ i +"  и  "+ j +"  из массива   "+ Arrays.toString(nums));
                        return new int[]{i, j};
                    }
                }
            }
            System.out.println("не найдено");
            return new int[]{}; // не найдено
        }
    }










