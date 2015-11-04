package com.mih.leetcode;

import java.util.Arrays;

/**
 * Created by meislzhua on 15/11/1.
 */
public class RotateArray {
	public static void main(String[] args) {
		int []a = {1,2,3,4,5,6,7,5,5,5};
		new RotateArray().rotate(a, 3);
		System.out.println(Arrays.toString(a));
	}

	public void rotate(int[] nums, int k) {
		//with space O(k),time O(n)
		//33 / 33 test cases passed. 0ms 98.34%

		if(nums.length == 0 || k == 0) return;
		k = k % nums.length;

		//初始化 并获取需要在前的元素
		int[] ratote = new int[k];
		System.arraycopy(nums, nums.length - k, ratote, 0, k);
		//值还原
		System.arraycopy(nums, 0, nums, k, nums.length - k);
		System.arraycopy(ratote, 0, nums, 0, k);

	}
}
