package com.example.springBoot.DSA;

public class InPlaceRemove {

    public static void swapper(int[] nums, int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] removeElement(int[] nums, int val) {
        int k =0 ;
        for( int i = 0 ; i < nums.length ; i++){
            if( nums[i]!= val){
                nums[k]= nums[i];
                k++;
            }
        }
        for( int i = k ; i< nums.length;i++ )
            nums[i] = val;
        return nums;
    }

    public static void main(String[] args){
        int [] nums = new int[]{1,1,2,3,4};
       int [] result =  removeElement(nums,1);
       for( int i : result){
           System.out.printf("%d ",i);
       }
    }
}
