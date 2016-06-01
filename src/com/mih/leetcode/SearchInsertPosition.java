package com.mih.leetcode;

/**
 * Created by hack on 16/6/1.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int tmp,left = 0, right = nums.length;
        while (left < right) {
            tmp = (left + right) / 2;
            if (nums[tmp] > target) {
                right = tmp;
            } else if (nums[tmp] < target) {
                left = tmp;
            } else {
                return tmp;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 7}, 9));
    }
}
