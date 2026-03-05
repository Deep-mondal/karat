package com.deep.slidingwindow;

public class MaxSumFw {
    public static void main(String[] args) {
        int arr[]={2,4,5,-1,-8,9,0,2,-6,3};
        int k=3;
        int windowSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum=windowSum-arr[i-k]+arr[i];
            maxSum=Math.max(maxSum,windowSum);
        }
        System.out.println(maxSum);
    }

}
