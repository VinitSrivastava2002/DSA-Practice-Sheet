package Binary_Search;

public class Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {4,6,7,8,9,0,1,2,3};
        int target = 0;
        System.out.println(searchInRotatedSortedArray(nums, target));

    }
    public static int searchInRotatedSortedArray(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s + (e-s)/2;

            if(nums[m]==target){
                return m;
            }
            if(nums[s] <= nums[m]){
                if(nums[s]<=target && target<nums[m]){
                    e=m-1;
                } else {
                    s=m+1;
                }
            }
            else{
                if(nums[m]<target && target<=nums[e]){
                    s=m+1;
                } else{
                    e=m-1;
                }
            }
        }
        return -1;
    }
}
