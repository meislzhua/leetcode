package com.mih.leetcode;

/**
 * Created by tigoo on 16-7-28.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int size = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] != nums[i-1]) nums[size++] = nums[i];
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,1,1,2,2,3,3}));
    }
}
