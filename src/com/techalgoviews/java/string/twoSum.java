package com.techalgoviews.java.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add
 * up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (targetMap.containsKey(nums[i])) {
                return new int[]{i, targetMap.get(nums[i])};
            } else {
                targetMap.put(target - nums[i], i);
            }
        }
        return new int[]{};
    }

    @Test
    public void test1() {
        // Given
        int[] nums = {2,7,11,15};
        int target = 9;

        // When
        int[] result = twoSum(nums, target);

        // Then
        int[] expected = new int[]{0, 1};
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        // Given
        int[] nums = {3, 2, 4};
        int target = 6;

        // When
        int[] result = twoSum(nums, target);

        // Then
        int[] expected = new int[]{1, 2};
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        // Given
        int[] nums = {3, 3};
        int target = 6;

        // When
        int[] result = twoSum(nums, target);

        // Then
        int[] expected = new int[]{0, 1};
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}
