package com.mih.leetcode;

/**
 * Created by meislzhua on 15/11/4.
 */
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		//1108 / 1108 test cases passed. 2 ms 21.21%
		if(n <= 0) return false;
		for(int max = 1<<30,i = 1; 1 <= max ; i<<=1 ){
			if((n & i) != 0){
				if(n == i) return true;
				else return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new PowerOfTwo().isPowerOfTwo(0x4400));
	}
}
