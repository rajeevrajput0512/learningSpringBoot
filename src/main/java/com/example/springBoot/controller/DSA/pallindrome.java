package com.example.springBoot.controller.DSA;

public class pallindrome {

    public  static  boolean printer(String s){
        int i = 0 ;
        int j = s.length() -1;
        while( i<=j){
            char value1 = Character.toLowerCase(s.charAt(i)) ;
            char value2 = Character.toLowerCase(s.charAt(j));
            int ASCII1 = (int)value1;
            int ASCII2 = (int)value2;
            if( value1 == ' ' &&  ASCII1< 97 || ASCII1 >122){
                i++;
                continue;
            }
            if(value2 == ' ' || ASCII2< 97 || ASCII2 >122) {
                j--;
                continue;
            }
            if(value1 != value2) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(printer(s));
    }
}
