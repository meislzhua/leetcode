package com.mih.leetcode;

import java.util.*;

/**
 * Created by hack on 16/5/28.
 */
public class IntersectionOfTwoArraysII {

    int[] toIntArray(List<Integer> list)  {
        int[] ret = new int[list.size()];
        int i = 0;
        for (Integer e : list)
            ret[i++] = e.intValue();
        return ret;
    }

    public int[] solutionWithSore(int[] nums1, int[] nums2) {
        if(nums1.length==0 ||nums2.length==0) return new int[]{};
        int index1 = nums1.length - 1, index2 = nums2.length - 1, turn = 2;
        List<Integer> list = new ArrayList<Integer>(Math.min(nums1.length, nums2.length));


        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (index1 >= 0 && index2 >= 0) {
            if (nums2[index2] > nums1[index1]) {
                index2--;
            } else if (nums2[index2] < nums1[index1]) {
                index1--;
            } else {
                list.add(nums2[index2]);
                index1--;
                index2--;
            }
        }

        return toIntArray(list);
    }

    public int[] solutionWithHashMap(int[] nums1, int[] nums2) {
        return null;
    }



    public int[] intersect(int[] nums1, int[] nums2) {


        return solutionWithSore(nums1,nums2);
    }
}
