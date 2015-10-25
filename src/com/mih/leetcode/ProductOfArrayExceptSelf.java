package com.mih.leetcode;

import java.util.Arrays;

/**
 * Created by meislzhua on 15/10/25.
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		// 2ms
		int sum = 1;
		int zero = -1;
		//计算全部数值的乘法总和,并检查第一个 0的的位置 (有2个0以上,肯定全为0)
		for(int size = nums.length-1 ; size >= 0 ;size--){
			if(nums[size] == 0 && zero == -1) {
				zero = size;
				continue;
			}
			sum*=nums[size];
		}
		//总数 / 本身 = 其他数总和 ,若是0,则不用除以本身
		for(int size = nums.length-1 ; size >= 0 ;size--){
			if(zero != -1){
				nums[size] = 0;
				if(zero == size){nums[size] = sum;}
			}else{
				nums[size] = sum / nums[size];
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int [] a = new int[]{1,2,0,4,0};
		System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(a)));
	}
}
