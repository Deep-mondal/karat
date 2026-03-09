package deep.dsa.array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={2,0,4,5,6,7,0,3,6};
        int c=0;
        for(int i=0;i<arr.length&&i+1<arr.length;i++){
            if(arr[i]==0&&arr[arr.length-1]!=0){
                arr[i]=arr[i+1];
                c++;
            }
        }
        for(int i= arr.length-c;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
