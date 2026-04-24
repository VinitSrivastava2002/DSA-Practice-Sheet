package Binary_Search;

import java.util.Arrays;

public class Find_First_And_Last_Element {
    public static void main(String[] args) {
        int[] nums = {1,3,4,6,6,6,6,7,9,11,12};
        int target = 6;
        int[] res=searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] searchRange(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int[] res={-1, -1};
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m]==target){
                int l=m;
                int r=m;
                while(l>0 && nums[l-1]==target){
                    l--;
                }
                res[0]=l;
                while(r<nums.length-1 && nums[r+1]==target){
                    r++;
                }
                res[1]=r;

            }
            if(nums[m]<target){
                s=m+1;
            } else {
                e=m-1;
            }
        }
        return res;
    }
}
