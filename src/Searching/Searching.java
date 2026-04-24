package Searching;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {45, 36, 28, 16, 11, 9, 6, 5, 2, 1};
        int target = 9;
//        System.out.println(binarySearch(arr, target));
//        System.out.println(linearSearch(arr, target));
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    // Linear Search - Time Complexity - O(N)
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // Binary Search - Time Complexity - O(logN)
    public static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

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

    // Order Agnostic Binary Search
    public static int orderAgnosticBinarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        boolean isAccend = arr[s] < arr[e];

        while(s<=e){
            int mid = s+(e-s)/2;

            // base condition
            if(arr[mid] == target){
                return mid;
            }

            if(isAccend){
                if(arr[mid]< target){
                    s = mid + 1;
                } else {
                    e = mid -1;
                }
            } else {
                if(arr[mid] > target){
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
