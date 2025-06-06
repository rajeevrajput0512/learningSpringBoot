package com.example.springBoot.controller.DSA;

public class Heap {
    public static void swap ( int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int getParent(int[] arr , int pos){
        return (pos-1)/2;
    }

    public static void createHeap(int[] arr, int currentPos){
        int parentPos = getParent(arr ,currentPos );
        if(currentPos == 0 ||  arr[parentPos] > arr[currentPos] ){
            return;
        }
        swap(arr,parentPos,currentPos);
        createHeap(arr,parentPos);
    }
    public static void main(String[] args) {
        int [] arr = {3,5,2,6,2,77,4,1,7,25,11};
        int [] heapedArr = new int[arr.length];
        heapedArr[0] = arr[0];
        for( int i =1 ; i< arr.length ; i++){
            heapedArr[i] = arr[i];
            createHeap(heapedArr,i);
        }
        for(int i: heapedArr){
            System.out.printf( "%d " , i);
        }
    }
}
