package com.array.rotation;

import java.util.Arrays;

public class ReverseAlgo {

    private static void leftRotation(int[] arr, int d) {
        if(d ==0)
            return;
        int n = arr.length;
        d = d%n;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
    private static void arrayPrint(int[] arr){
        for (int a:arr)
            System.out.print(a);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int d = 3;
        leftRotation(arr,d);
        arrayPrint(arr);
       // Arrays.stream(arr).sequential();
    }
}
