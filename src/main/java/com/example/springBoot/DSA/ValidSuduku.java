package com.example.springBoot.DSA;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSuduku {

    public static boolean validRow (char [][] board , int rowIdx){
        Set<Character> unique = new HashSet<>();
        for( int i = 0 ; i< 9 ; i++){
            char value = board[rowIdx][i];
            if(value == '.') continue;
            if( unique.contains(value)) {
                return false;
            }
            unique.add(value);
        }
        return true;
    }

    public static boolean validColumn (char [][] board , int colIdx){
        Set<Character> unique = new HashSet<>();
        for( int i = 0 ; i< 9 ; i++){
            char value = board[i][colIdx];
            if(value == '.') continue;
            if( unique.contains(value)) {
                return false;
            }
            unique.add(value);
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','3'},
                {'.','.','.','.','.','.','.','.','4'},
                {'.','1','.','.','.','3','.','.','5'},
                {'7','2','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validColumn(board,1));
    }
}
