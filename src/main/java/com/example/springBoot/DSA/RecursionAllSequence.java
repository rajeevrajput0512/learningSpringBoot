package com.example.springBoot.DSA;

import java.util.ArrayList;
import java.util.List;

public class RecursionAllSequence {

    public static void allSubsequnce(String newString , String originalString){
        if(originalString.isEmpty()){
            System.out.println(newString);
            return;
        }
        String addingChar = newString+ originalString.charAt(0);
        String original = originalString.substring(1);
        allSubsequnce(newString,original);
        allSubsequnce(addingChar,original);
    }
    public static void main(String[] args){
        String str = "abc";
//        List<Integer > res = new ArrayList<>();
        allSubsequnce("",str);
    }
}
