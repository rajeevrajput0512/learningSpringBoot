package com.example.springBoot.controller.DSA;

import java.util.HashMap;
import java.util.Map;

public class ContainsDup1 {
    public static  void main(String[] args){
        int[] nums = {1,2,3,4,1,2,1,8};
        int k = 2 ;
        Map<Integer,Integer> mapWithIndex = new HashMap();
        for( int i = 0 ; i < nums.length;i++){
            int itr = nums[i];
            if(mapWithIndex.containsKey(itr)){
//                Math.abs();
            }else{
                mapWithIndex.put(itr,i);
            }
        }
    }
}
