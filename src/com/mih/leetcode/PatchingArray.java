package com.mih.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hack on 16/6/2.
 */
public class PatchingArray {

    /**
     * bac solve
     * @param nums
     * @param n
     * @return
     */
    public int badSolve(int[] nums, int n) {
        int patch = 0,patch_num = 0;
        List<Integer> tmp = new ArrayList();

        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            tmp.clear();
            tmp.add(num);
            for (Integer i : set) {
                tmp.add(i + num);
            }
            set.addAll(tmp);
        }
        tmp.clear();


        for (int i = 1; i < n; i++) {
            if(set.contains(i)) continue;
            tmp.add(i);
        }

        while(tmp.size() >0){
            patch_num = tmp.get(0);
            for(int i = tmp.size()-1;i>0;i--){
                if(set.contains(tmp.get(i) - patch_num)){
                    set.add(tmp.get(i));
                    tmp.remove(i);
                }
            }
            set.add(patch_num);
            tmp.remove(0);
            patch++;
        }
        return patch;
    }

    /**
     *
     * @reference
     */
    public int minPatches(int[] nums,int n){
        int patch = 0;
        long sum = 0;
        int index = 0;
        while(sum<n){
            if( index == nums.length || nums[index] > sum+1){
                sum+= sum+1;
                patch++;
            } else {
                sum+= nums[index++];
            }
        }
        return patch;
    }
    public static void main(String[] args) {
        System.out.println(new PatchingArray().minPatches(new int[]{1, 2, 31,33},2147483647));
    }
}
