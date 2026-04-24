package Searching;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 7;
        System.out.println(Arrays.toString(searchInSortedMAtrix(arr, target)));
    }

    public static int[] searchInSortedMAtrix(int[][] arr, int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=s+(e-s)/2;

            // search row wise
            if(arr[m][0]<=target && arr[m][arr[0].length-1]>=target){
                // search in that row
                int[] index= search(arr, target,m);
                    return index;
            }

            if(arr[m][0]<target){
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
     return new int[]{-1,-1};
    }

    public static int[] search(int[][] arr, int target, int m){
        int s=0;
        int e=arr[m].length-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[m][mid] == target){
                return new int[]{m,mid};
            }

            if(arr[m][mid]<target){
                s=mid+1;
            } else{
                e=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
