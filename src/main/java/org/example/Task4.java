package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Task4 {

    /*
    Дан целочисленный массив nums.
    Верните true, если хотя бы одно значение встречается как минимум дважды в массиве,
    и верните false, если каждый элемент уникален.

    Example 1:
    Input: nums = {1,2,3,1}
    Output: true

    Example 2:
    Input: nums = {1,2,3,4}
    Output: false

     */

//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == ){
//
//            }
//
//        }
//
//
//    }


    public static boolean containsDuplicateDecision1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }


    public boolean containsDuplicateDecision2(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }


    public boolean containsDuplicateDecision3(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }


}
