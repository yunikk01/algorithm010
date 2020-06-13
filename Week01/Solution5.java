package com.company.algorithm.week01;

public class Solution5 {

    public static void rotate(int[] nums,int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i< nums.length;i++){
            int value = (i+k)%nums.length;
            System.out.println(value);
            a[(i+k)%nums.length]=nums[i];
        }

        for (int i=0 ;i<a.length;i++) {
            nums[i]=a[i];
            System.out.println(a[i]+" " +i);
        }
    }

    public static void rotate1(int[] nums,int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
        for (int i = 0; i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,0,3,2,4};
        int k = 3;
        rotate1(nums,3);

    }
}


