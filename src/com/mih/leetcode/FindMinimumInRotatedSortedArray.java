package com.mih.leetcode;

/**
 * Created by tigoo on 16-7-28.
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (right > left){
            int mid = (left + right)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }

    public static void main(String[] args) {
        System.out.println(new FindMinimumInRotatedSortedArray().findMin(new int[]{3,4,5,6,7,8,0,1,2}));
    }
}
