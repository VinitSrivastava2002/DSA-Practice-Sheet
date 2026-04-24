package Searching;

public class SearchPositionInInfiniteArray {
    public static void main(String[] args) {
        // Find position of an array in a sorted array of infinite numbers
        int[] arr ={2,5,9,12,14,16,18,20,23,25,28,30};
        int target = 12;
        System.out.println(findRangeTargetLie(arr,target));
    }
    public static int findRangeTargetLie(int[] arr, int target){
        int s=0;
        int e=0;
        int i=1;
        while (!(arr[s]<target && arr[e]>target)){
                s = e+1;
                e = 2^i *2;
                i++;
        }

        int res =binarySearch(s, e, arr, target);
        return res;

    }

    public static int binarySearch( int s, int e, int[] arr, int target){
        while(s<=e){
            int mid = s+(e-s)/2;

            // base condition
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]< target){
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
        return -1;
    }
}
