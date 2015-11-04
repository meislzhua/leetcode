package com.mih.leetcode;

/**
 * Created by meislzhua on 15/11/4.
 */
public class NumberOf1Bits {
	public int hammingWeight(int n) {
		//normal,sorry i can't found better one
		// 600 / 600 test cases passed. 2 ms 14.86%
		int sum = 0;
		for(int i = 0;i<32 ; i++,n >>= 1){
			sum += n & 1;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new NumberOf1Bits().hammingWeight(0xFF444FFF) );
	}
}
