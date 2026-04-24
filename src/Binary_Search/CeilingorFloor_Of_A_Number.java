package Binary_Search;

public class CeilingorFloor_Of_A_Number {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,10,13,16};
        int target =11;
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target));
    }

    public static int ceiling(int[] nums, int target ){
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(s!= nums.length-1 && nums[m]<target){
                s=m+1;
            } else if(e!=0 && nums[m]>target) {
                e=m-1;
            } else{
                return nums[m];
            }
        }
        return nums[s];
    }

    public static int floor(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m]<target){
                s = m+1;
            } else if(nums[m]>target){
                e = m-1;
            } else{
                return nums[m];
            }
        }
        return nums[e];
    }
}
