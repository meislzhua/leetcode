package com.mih.leetcode;

import java.util.HashMap;
/**
 * Created by meislzhua on 15/11/6.
 Given an array of integers and an integer k,
 find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 and the difference between i and j is at most k.

 Subscribe to see which companies asked this question
 */
public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		//using hashmap
		//19 / 19 test cases passed.Runtime: 12 ms 70.76%
		HashMap<Integer,Integer> map = new HashMap<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			Integer tmp = map.get(nums[i]);
			if(tmp != null && i - tmp <= k)return true;
			map.put(nums[i],i);
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1,0,1,1},1));
	}
}
