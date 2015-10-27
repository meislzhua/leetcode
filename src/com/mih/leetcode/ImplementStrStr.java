package com.mih.leetcode;

/**
 * Created by meislzhua on 15/10/26.
 Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Update (2014-11-02):
 The signature of the function had been updated to return the index instead of the pointer.
 If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.
 */
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		// 7ms
		int size_haystack = haystack.length();
		int size_needle = needle.length();
		if(size_needle == 0 ) return 0;
		for(int i = 0, len = size_haystack - size_needle;i<=len;i++){
			int index = 0,tmp = i;
			while(haystack.charAt(i)==needle.charAt(index)){
				index++;i++;
				if(index == needle.length()) return i-index;
			}
			i = tmp;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new ImplementStrStr().strStr("ississip","issip"));
	}
}
