package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,1,3,8,4,9,15,13,14,11};
//        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

    }

    public static void swap(int a, int b, int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
