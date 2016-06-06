package com.mih.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hack on 16/6/6.
 *
 * @bad
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return parse(set.toArray(new Integer[set.size()]));
    }

    public int[] parse(Integer[] list){
        int[] r = new int[list.length];
        for(int i = 0;i<list.length;i++){
            r[i] = list[i];
        }
        return r;
    }
}
