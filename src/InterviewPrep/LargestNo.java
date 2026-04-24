package InterviewPrep;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LargestNo {
    public static void main(String[] args) {
        int[] arr={1,2,4,1,3,2,4,5,6,8};
//        System.out.println(largestNo(arr));
//        System.out.println(secondLargetNo(arr));
        System.out.println(kth_largestNo(arr, 3));
    }
    //find largest in the array
    public static int largestNo(int[] nums){
        //brute force approach - sort and return last element nlogn
//        Arrays.sort(nums);
//        return nums[nums.length-1];
        // better approch O(n)
        int maxValue=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>maxValue){
                maxValue=num;
            }
        }
        return maxValue;
    }

    //find 2nd largest no
    public static int secondLargetNo(int[] nums){
        int largetNo=nums[0];
        int secondlargestNo=nums[0];
        for(int i=0;i<nums.length;i++){
            if(largetNo<nums[i]){
                secondlargestNo=largetNo;
                largetNo=nums[i];
            }
        }
        return secondlargestNo;
    }

    public static int kth_largestNo(int[] nums,int k){
        //brute force
//        Arrays.sort(nums);
//        return nums[nums.length-1-k];
        //Optimize approach - use max Heap

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int num:nums){
            if(pq.size()>k){
                pq.poll();
            }
            pq.add(num);
        }
        return pq.peek();

    }
}
