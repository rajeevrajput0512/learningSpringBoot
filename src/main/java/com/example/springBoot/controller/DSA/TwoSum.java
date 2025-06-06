package com.example.springBoot.controller.DSA;

public class TwoSum {
    public  static  void main(String[] args){
        int[] numbers={1,3,4,5,7,10,11};
        int target = 9;
        int i = 0 ;
        int j = numbers.length -1;
        while(i< j){
            if(numbers[i]+ numbers[j] > target){
                j--;
            }
            else if(numbers[i]+ numbers[j] < target){
                i++;
            }
            else{
                System.out.printf("%d %d",i+1,j+1);
                break;
            }

    }
    }
}
