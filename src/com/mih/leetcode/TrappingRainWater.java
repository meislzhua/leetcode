package com.mih.leetcode;

import java.util.Stack;

/**
 * Created by hack on 16/5/29.
 *
 * @referee
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        if(height.length<2) return 0;
        int highest = height[0];
        int water = 0;
        int[] left_height = new int[height.length];

        for (int i = 1, size = height.length - 1; i < size; i++) {
            if (height[i] > highest) highest = height[i];
            left_height[i] = highest;
        }

        highest = height[height.length - 1];
        for(int i = height.length - 2;i>=1;i--){
            if (height[i] > highest) highest = height[i];
            water+= Math.min(left_height[i],highest) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        System.out.println(new TrappingRainWater().trap(new int[]{2,0,2,3,2,1,4}));
    }
}
