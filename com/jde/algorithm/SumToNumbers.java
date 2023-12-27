package com.jde.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 01-两数之和
 * 简单
 */
public class SumToNumbers {

    public static void main(String[] args) {
        SumToNumbers s = new SumToNumbers();
        int[] a = {1, 2, 7, 3, 9, 4};
        int[] b = s.twoSum(a, 13);
        int[] c = s.twoSum1(a, 13);
        System.out.println(b[0] + "===" + b[1]);
        System.out.println(c[0] + "===" + c[1]);

    }

    public int[] twoSum(int[] nums, int target) {
        int[] ns = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    ns[0] = i;
                    ns[1] = j;
                }
            }
        }
        return ns;
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
