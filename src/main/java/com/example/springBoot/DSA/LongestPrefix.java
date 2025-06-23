package com.example.springBoot.DSA;

public class LongestPrefix {


    public static  String longestCommonPrefix(String[] strs) {
        String result = "";
        String referenceString = strs[0];
        if( referenceString.isEmpty()){
            return  result;
        }
        if(strs.length == 1){
            return referenceString;
        }
        for( int i =0 ; i< referenceString.length();i++) {
            int j = 1;
            while (j < strs.length) {
                if ( i <strs[j].length() && strs[j].charAt(i) == referenceString.charAt(i)) {
                    j++;
                    continue;
                } else {
                    return result;
                }
            }
            result += referenceString.charAt(i);
        }
        return result;
    }

    public static  void main(String [] args){
        String [] strs= {"neet","feet"};
        System.out.println(longestCommonPrefix(strs));
    }
}
