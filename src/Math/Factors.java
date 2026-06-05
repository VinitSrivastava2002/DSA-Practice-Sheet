package Math;

public class Factors {
    public static void main(String[] args) {
      int n=20;
      //brute force approach
//      for(int i=1;i<n;i++){
//          if(n%i==0){
//              System.out.print(i + ", ");
//          }
//      }

      //optimize approach
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                // this is used to ignore duplicate like 36/6 = 6 so printing of two time 6 its print one time
                if(n/i==i){
                    System.out.println(i);
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
}
