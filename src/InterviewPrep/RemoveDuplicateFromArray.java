package InterviewPrep;
import java.util.*;
public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,1,3,2,4,5,6,8};
//        removeDuplicate(arr);
        countOccurance(arr);

    }
    public static void removeDuplicate(int[] nums){
        // O(n)
//        Set<Integer> st=new HashSet<>();
//        for(int num:nums){
//            st.add(num);
//        }
//
//        System.out.print(st);

        List<Integer> ls=new ArrayList<>();
        int k=0;
        for(int num:nums){
            if(!ls.contains(num)){
                nums[k++]=num;
            }
            ls.add(num);
        }
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+", ");
        }
    }

    public static void countOccurance(int[] nums){
            Map<Integer, Integer> mp=new HashMap<>();
            for(int num:nums){
                mp.put(num, mp.getOrDefault(num,0)+1);
            }
            System.out.println(mp);
    }
}
