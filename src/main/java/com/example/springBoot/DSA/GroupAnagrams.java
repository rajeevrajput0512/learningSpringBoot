package com.example.springBoot.DSA;

import java.util.*;

public class GroupAnagrams {


   public static void main(String[] args){
       String[] strs =  {"act","pots","tops","cat","stop","hat"};
       Map<String , List<String>> mapper = new HashMap<>();
       List <List<String>> ans = new ArrayList<>();
       for( String itr :strs){
           char[] converted = itr.toCharArray();
           Arrays.sort(converted);
           String sortedString  = new String(converted);
           if( mapper.containsKey(sortedString)){
               List<String> existingList = mapper.get(sortedString);
               existingList.add(itr);
               mapper.put(sortedString,existingList);
           }else{
               List<String> newList= new ArrayList<>();
               newList.add(itr);
               mapper.put(sortedString,newList);
           }
       }
       for( Map.Entry<String,List<String>> ty: mapper.entrySet()){
           ans.add(ty.getValue());
       }
       System.out.println(ans);
   }

}
