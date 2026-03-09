package deep.dsa.sorting;

import java.util.Arrays;

public class InsersionSort {
    public static void main(String[] args) {
        int arr[]={2,4,5,1,6,-1,6,0,34,23,14,56,78,98,37};
        for(int step=1;step<arr.length;step++){
            int key=arr[step];
            int j=step-1;
            while(j>=0&&key<=arr[j]){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
