package com.mih.leetcode;

/**
 * Created by meislzhua on 15/11/6.
 Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

 Subscribe to see which companies asked this question
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		//121 / 121 test cases passed. Runtime: 1 ms , 43.63%
		int miss = 0;
		for (int i= nums.length -1 ; i >=0 ; i--) {
			miss = miss + i - nums[i];
		}
		miss += nums.length;
		return miss;
	}

	public static void main(String[] args) {
		System.out.println(new MissingNumber().missingNumber(new int[]{0,1,2,3,4,5,6}));
	}
}
