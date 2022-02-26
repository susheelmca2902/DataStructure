package com.array;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.leftRotation(arr,d,arr.length);
        arrayRotation.printArray(arr,arr.length);
    }
    public void leftRotation(int[] arr, int d, int n){
        for(int i=0; i<d; i++){
            leftRotateByOne(arr,n);
        }
    }

    private void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0];
        // copying array 0th to 1st index
        if (n - 1 >= 0) System.arraycopy(arr, 1, arr, 0, n - 1);
        arr[n-1] = temp;
    }
    private void printArray(int[] arr, int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
