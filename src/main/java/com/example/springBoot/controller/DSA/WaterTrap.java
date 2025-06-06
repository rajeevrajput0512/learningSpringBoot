package com.example.springBoot.controller.DSA;

public class WaterTrap {

    public static int area(int i , int j, int height1 , int height2 ){
        int ans =  (j-i) * Math.min(height1,height2);
        return  ans;
    }
    public static void main(String[] args){
        int[] arr = {1,7,2,5,4,7,3,6};
        int i = 0;
        int j = arr.length -1;
        int maxSum = -1;
        while( i < j){
            int height1 = arr[i];
            int height2 = arr[j];
           maxSum =  Math.max(maxSum,area(i,j,height1,height2));
            if( height1 <=height2){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(maxSum);
    }
}
