package com.deep.slidingwindow;

public class MinSumFw {
    public static void main(String[] args) {
        int arr[]={2,4,5,-1,-8,9,0,2,-6,3};
        int k=3;
        int windowSum=0;
        int minSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        minSum=windowSum;
        for(int i=k;i<arr.length;i++){
            minSum=minSum-arr[i-k]+arr[i];
            minSum=Math.min(minSum,windowSum);
        }
        System.out.println(minSum);

    }
}
