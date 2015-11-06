package com.mih.leetcode;

import java.util.Arrays;
import java.util.HashMap;

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
public class TwoSum {
	//using hashmap
	//16 / 16 test cases passed.Runtime: 5 ms ,96.09%
	public int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		HashMap<Integer,Integer> map = new HashMap<>(len);
		int now ;
		Integer other;
		for (int i = 0; i < len; i++) {
			now = nums[i];
				other = map.get(target-now);
				if(other != null){
					return  other > i?new int[]{i+1,other+1}:new int[]{other+1,i+1};
				}
				map.put(now,i);
		}
		return new int[2];
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{-2,2,3,6,0},0)));
	}
}
