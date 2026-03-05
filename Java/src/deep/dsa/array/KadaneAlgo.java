package com.deep.array;

public class KadaneAlgo {
    public static void sumOfSubArray(int arr[]){
        int sum=arr[0];
        int result=0;
        for(int i:arr){
            result=result+i;
            if(result<sum){

            }
            if(result<=0){

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,4,5,-6,7,8,9};
        KadaneAlgo.sumOfSubArray(arr);
    }
}
