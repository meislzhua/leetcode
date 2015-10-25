package com.mih.leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by meislzhua on 15/10/25.

 Given two numbers represented as strings, return multiplication of the numbers as a string.

 Note: The numbers can be arbitrarily large and are non-negative.

 */
public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		// my implement 7ms
		int s1_len = num1.length();
		int s2_len = num2.length();
		char[] list = new char[s1_len+s2_len];
		//初始化
		for(int size = list.length-1;size >= 0 ; size--){
			list[size] = 0;
		}
		//直接运算
		for(int i = s1_len-1,t = 0 ; i >= 0; i--,t++){
			char tmp = (char) (num1.charAt(i)-48);
			for(int j = s2_len-1,t2 = 0; j >= 0 ; t2++,j--){
				list[t+t2] += (char) (tmp * (num2.charAt(j)-48));
			}
		}
		//进位
		for(int i =0,size = list.length;i<size;i++ ){
			if(list[i]<10) continue;
			list[i+1]+=list[i]/10;
			list[i]%=10;
		}
		//导入字符串
		boolean isHead = true;
		StringBuffer stringBuffer = new StringBuffer(list.length);
		for(int size = list.length-1;size>=0;size--){
			if(isHead && list[size] == 0) continue;
			stringBuffer.append((char)(list[size]+48));
			isHead = false;
		}
		if (stringBuffer.length() == 0)stringBuffer.append(0);
		return stringBuffer.toString();
	}
	public String multiply2(String num1, String num2) {
		//java bigDecimal implement 24ms
		return new BigDecimal(num1).multiply(new BigDecimal(num2)).toString();
	}

	public static void main(String[] args) {
		System.out.println(new  MultiplyStrings().multiply("4000","52"));
	}

}
