import java.util.*;

public class duplicate_value {
    public static void main(String[] args) {
        //find dublicate value
        int[] arr={1,2,4,1,3,2,4,5,7,8}; //1,2,4
        int j=0;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!ls.contains(arr[i])){
                arr[j++]=arr[i];
                ls.add(arr[i]);

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
