package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,1,3,8,4,9,15,13,14,11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //time complexity O(n^2) space complexity O(1)
    public static void bubbleSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
        }
    }

    public static void swap(int a, int b, int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
