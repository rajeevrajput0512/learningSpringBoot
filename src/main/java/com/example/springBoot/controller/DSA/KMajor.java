package com.example.springBoot.controller.DSA;

import java.util.*;

public class KMajor {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 2, 77, 4, 1, 7, 25, 11};
        Map<Integer, Integer> frequencyMapper = new HashMap<>();
        for( int i: arr){
            frequencyMapper.put(i,frequencyMapper.getOrDefault(i,0)+1);
        }
        List <int[]> listOfPair = new ArrayList<>();
        for( Map.Entry<Integer, Integer > entry : frequencyMapper.entrySet()){
            int [] ele = new int[]{entry.getKey(), entry.getValue()};
            listOfPair.add(ele);
        }
        listOfPair.sort((a,b)-> b[1] - a[1]);
        int k = 2;
        int [] result = new int[k];
        int i = 0;
        for( int[] pair :listOfPair){
            System.out.printf("%d,%d ",pair[0],pair[1]);
            System.out.println();
            result[i] = pair[0];
            if( i == k-1){

            }
        }


    }
}
