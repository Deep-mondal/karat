package com.deep.slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegetiveNumberEveryWindowFw {
    public static void main(String[] args) {
        int arr[]={2,4,5,-1,-8,9,0,2,-6,3};
        int k=3;
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                que.add(i);
            }
            if(i>=k-1){
                if(!que.isEmpty()&&que.peek()>=i-k+1){
                    System.out.println(arr[que.peek()]+" ");
                }
                else{
                    System.out.println(0);
                }
                if(!que.isEmpty()&&que.peek()==i-k+1){
                    que.poll();
                }
            }


        }
    }
}
