package com.example.springBoot.DSA;

import java.util.Stack;



public class RainWater {

    public static int distanceReducer(int i , int j ,int[] height){
        int max = 0;
        int copyA = i+1;
        while( copyA < j){
            max = Math.max(max,height[copyA]);
            copyA++;
        }
       return (max)* (j-i-1);
    }
    public static void main( String [] args){
        int[] height = {2,1,0,1,3};
        Stack<int[]> rainStack = new Stack<>();
        int sum = 0;
        for ( int i=0 ; i< height.length ; i++){
            int itrValue = height[i];

                int []top = rainStack.peek();
                int topValue = top[0];
                int distance = top[1];
                    while(!rainStack.isEmpty() && itrValue > topValue){
                        int [] kpr = rainStack.pop();
                        topValue = kpr[0];
                        distance = kpr[1];
                        if (rainStack.isEmpty()) {
                            break;
                        }
                        sum += (i - distance) * Math.min(itrValue,topValue);
                        sum -=distanceReducer(distance-1,i,height);
                    }
                        rainStack.push(new int[]{itrValue, i+1});

            }
        }

}
