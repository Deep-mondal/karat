package com.deep.array;

public class ArrayRotation {
     public static void reverse(int arr[],int f,int r){
        while(r>f){
            int t=arr[f];
            arr[f]=arr[r];
            arr[r]=t;
            f++;
            r--;
        }
    }
    public static void arrayRotation (int arr[]){
        int k=3;
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        ArrayRotation.arrayRotation(arr);
    }
}
