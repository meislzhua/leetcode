package com.mih.leetcode;

/**
 * Created by meislzhua on 15/10/26.
 Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.

 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		//0ms?
		int size = digits.length-1;
		for(;size>=0;size--){
			if(digits[size]==9) {
				digits[size]=0;
			}else{
				digits[size]+=1;
				return digits;
			}
		}
		if(size<0) {
			int[]tmp = new int[digits.length+1];
			tmp[0] = 1;
			System.arraycopy(digits, 0, tmp, 1, digits.length);
			return tmp;
		}
		return digits;
	}

}
