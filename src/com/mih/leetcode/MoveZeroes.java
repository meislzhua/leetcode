package com.mih.leetcode;

import java.util.Arrays;

/**
 * Created by meislzhua on 15/10/27.
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		//1 ms
		int size = nums.length,now = 0;
		//把非0都移到前面
		for(int i = 0 ; i < size ; i++){
			if(nums[i] == 0){continue;}

			if(i == now) {
				now ++;
				continue;
			}
			nums[now] = nums[i];
			now ++;
		}
		//把非0的数字压缩到最前后,后面的全改为0
		for(;now < size;now++){
			if(nums[now] != 0)nums[now] = 0;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[]{1,0,2,4,2,0,5,4,0,0,3,4,5,0,6};
		new MoveZeroes().moveZeroes(a);
		System.out.println(Arrays.toString(a));
	}
}
