package deep.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,4,5,1,6,-1,6,0,34,23,14,56,78,98,37};
        for(int step=0;step<arr.length;step++){
            int min_idx=step;
            for(int i=step+1;i<arr.length;i++){
                if(arr[i]<arr[min_idx]){
                    min_idx=i;
                }
            }
            int temp=arr[step];
            arr[step]=arr[min_idx];
            arr[min_idx]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
