package com.mih.leetcode;

/**
 * Created by meislzhua on 15/10/28.
 Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

 According to the definition of h-index on Wikipedia:
 "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

 For example, given citations = [3, 0, 6, 1, 5], which means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
 Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, his h-index is 3.

 Note: If there are several possible values for h, the maximum one is taken as the h-index.
 */
public class H_Index {
	public int hIndex(int[] citations) {
		//1ms O(n),but O(n) space
		int  sum = 0,len = citations.length;
		int[] hash = new int[len+1];
		for(int i = 0;i<len;i++){
			if(citations[i] > len) sum++;
			else hash[citations[i]]++;
		}
		for(;len>0;len--){
			sum+=hash[len];
			if(sum >= len) return len;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] citations = new int[]{4, 0, 6, 1, 5,3};
		System.out.println(new H_Index().hIndex(citations));
	}
}
