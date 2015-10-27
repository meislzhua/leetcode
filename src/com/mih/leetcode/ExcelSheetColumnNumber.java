package com.mih.leetcode;

/**
 * Created by meislzhua on 15/10/27.
 Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.
 */
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		//3ms
		int sum = 0;
		for(int len = s.length(),i = 0;i<len ;i++){
			sum = sum*26+s.charAt(i)-64;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new ExcelSheetColumnNumber().titleToNumber("AA"));
	}
}
