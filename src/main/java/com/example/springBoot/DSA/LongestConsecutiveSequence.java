package com.example.springBoot.DSA;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int i =0;
      while( i < 5){
          System.out.println(i);
          if( i ==4){
              break;
          }
          System.out.printf("***** %d" , i);
          i++;
      }

        System.out.println("ye condition different h");
      int j =0 ;
      while (j < 5){
          System.out.println(j);
          j++;
          if(j==4){
              break;
          }
          System.out.printf("***** %d" , j);
      }
}
}
