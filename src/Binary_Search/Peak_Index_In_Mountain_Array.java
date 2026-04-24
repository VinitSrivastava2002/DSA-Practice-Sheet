package Binary_Search;

public class Peak_Index_In_Mountain_Array {
    public static void main(String[] args) {
        int[] nums = {11,5,4,2,1};
        System.out.println(peakIndexInMountainArray(nums));
    }
    public static int peakIndexInMountainArray(int[] nums) {
        int s = 0;
        int e = nums.length-1;

        while(s<e){
            int m =  s + (e-s)/2;
            if(nums[m+1]>nums[m]){
                s=m+1;
            } else {
                e=m;
            }
        }
        return s;
    }
}
