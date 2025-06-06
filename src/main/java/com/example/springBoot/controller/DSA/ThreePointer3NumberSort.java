package com.example.springBoot.controller.DSA;

public class ThreePointer3NumberSort {

    private  static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColors(int[] nums) {
        int left = 0 ;
        int i = 0;
        int right = nums.length-1;
        while( i < right){
            if( nums[i] ==0){
                swap(nums,left,i);
                left++;
            }else if( nums[i] == 2){
                swap(nums,i,right);
                right--;
                i--;
            }
            i++;
        }

    }
    public static void main(String[] args){
        int [] nums = new int[]{2,1,0};
        sortColors(nums);
        for( int i  : nums){
            System.out.printf("%d ",i);
        }
    }
}
