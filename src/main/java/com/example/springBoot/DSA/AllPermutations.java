package com.example.springBoot.DSA;

public class AllPermutations {

    public  static  void allPermutationHelper(String newString, String original ){
        if(original.isEmpty()){
            System.out.println(newString);
            return;
        }
        for( int i=0 ; i< original.length();i++){
            String newOriginal = original.substring(0,i) + original.substring(i+1);
            allPermutationHelper(newString+original.charAt(i),newOriginal);
        }
    }
    public static void main(String[] args){
        String str = "abc";
//        List<Integer > res = new ArrayList<>();
        allPermutationHelper("",str);
    }
}
