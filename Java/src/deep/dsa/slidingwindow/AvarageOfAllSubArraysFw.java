package com.deep.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class AvarageOfAllSubArraysFw {
    public static void main(String[] args) {
        int arr[]={2,4,5,-1,-8,9,0,2,-6,3};
        int k=3;
        int resultTemp=0;
        List<Integer> result=new ArrayList<>();
        int windowSum=0;
        for (int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        resultTemp=windowSum/k;
        result.add(resultTemp);
        for(int i=k;i< arr.length;i++){
            windowSum=arr[i-k]+arr[i];
            resultTemp=windowSum/k;
            result.add(resultTemp);
        }
        System.out.println(result);
    }
}
