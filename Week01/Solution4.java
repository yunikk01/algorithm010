package com.company.algorithm.week01;

public class Solution4 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        //System.out.println(nums);
        return i + 1;
    }

    public static int removeDuplicates1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while (q< nums.length){
            if (nums[p] != nums[q]) {
                if (q-p>1) {
                    nums[p + 1] = nums[q];
                }
                p++;
            }
            q++;
        }
        return p + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1,1,2,3,4,4,5};
        System.out.println(nums.length);
        int size = removeDuplicates1(nums);
        System.out.println(size);

    }
}


