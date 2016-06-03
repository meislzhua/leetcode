package com.mih.leetcode;

import java.util.Arrays;

/**
 * Created by hack on 16/6/3.
 */
public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int M_tmp,B_tmp, left = 0, right = nums.length;

        //主要的二分搜索
        while (left < right) {
            M_tmp = (left + right) / 2;
            if (nums[M_tmp] > target) {
                right = M_tmp;
            } else if (nums[M_tmp] < target) {
                left = M_tmp + 1;
            } else {
                int mid = M_tmp;

                //当确定有这个元素的时候,开始2次二分搜索 寻找left,right
                while (left < M_tmp){
                    B_tmp = (left+M_tmp) /2;
                    if(nums[B_tmp] == nums[mid]){
                        M_tmp = B_tmp;
                    } else {
                        left = B_tmp + 1;
                    }
                }
                M_tmp = mid;

                while (M_tmp < right){
                    B_tmp = (right+M_tmp) /2;
                    if(nums[B_tmp] == nums[mid]){
                        M_tmp = B_tmp + 1;
                    } else {
                        right = B_tmp ;
                    }
                }

                return new int[]{left,M_tmp - 1};

            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] r  = new SearchForARange().searchRange(new int[]{1,1,1,2,3,4,4,4},1);
        System.out.println(Arrays.toString(r));
    }

}
