package com.company.algorithm.week01;

public class Solution3 {
       static int [] twoSum(int[] nums,int target){
        for (int i=0; i<nums.length;i++){
            for(int j= i+1 ;j<nums.length;j++){
                if (nums[i] == target - nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int[] nums= {1,3,6,7,9};
        int target = 8;
        int[] result = twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
