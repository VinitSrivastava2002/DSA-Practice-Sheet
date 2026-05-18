package Math;

public class IsPrime {
    public static void main(String[] args) {
        int n=20;
        for(int i=0;i<n;i++){
            System.out.println(i + " is " +isPrime(i));
        }

    }
    public static boolean isPrime(int num){
        //base condition
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
