package com.deep.array;

public class ArrayPsudoSum {
    public static void psudoSum(int arr[]){
        int f=0;
        for(int i=1;i<arr.length;i++){
            int t=arr[i-1];
            arr[i]=arr[i]+t;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        ArrayPsudoSum.psudoSum(arr);
    }
}
