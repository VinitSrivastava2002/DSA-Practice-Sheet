package Searching;

public class SearchCeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ceiling(arr, target));
        System.out.println(floor(arr, target));

    }

    public static int ceiling(int[] arr, int target){
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
        return arr[s];
    }

    public static int floor(int[] arr, int target){
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
        return arr[e];
    }
}
