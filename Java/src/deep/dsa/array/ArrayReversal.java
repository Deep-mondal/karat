package com.deep.array;

public class ArrayReversal {
    public static void reverse(int arr[]){
        int f=0,r=arr.length-1;
        while(r>f){
            int t=arr[f];
            arr[f]=arr[r];
            arr[r]=t;
            f++;
            r--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        ArrayReversal.reverse(arr);
    }
}
