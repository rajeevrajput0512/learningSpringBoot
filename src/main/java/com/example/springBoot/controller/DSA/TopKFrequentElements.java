package com.example.springBoot.controller.DSA;

import java.util.*;

public class TopKFrequentElements {
    public  static  void  main(String[] args){
        int[] nums = new int[]{1,2,2,3,3,3};
        int k = 2;
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for( int i: nums){
            frequencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
        }

        // alternative =
        int [] ans = new int[k];
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        entries.sort((a,b)->b.getValue() - a.getValue());

        int i = 0;
        for( Map.Entry<Integer,Integer> itr : entries){
            ans[i] = itr.getKey();
            if( i == k-1){
               break;
            }
            i++;
        }

//        List<int[]> notAns = new ArrayList<>();
//        int [] ans = new int[k];
//        for( Map.Entry<Integer,Integer> itr : frequencyMap.entrySet()){
//            notAns.add(new int[]{itr.getKey(),itr.getValue()});
//        }
//        notAns.sort((a,b)->b[1] - a[1]);
//        System.out.println(notAns);
//        for( int i = 0 ; i< k ; i++){
//            ans[i] = notAns.get(i)[0];
//        }
//        System.out.println(ans);
    }
}
