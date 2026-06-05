package Math;

public class FindAllPrimeNo {
    public static void main(String[] args) {
        int n=40;
        findAllPrimeNo(n);

    }

    //sieve of Eratosthenes algorithm
    public static void findAllPrimeNo(int n){
        // for n+1 index and bi-default every index value set to be 0
        boolean[] prime=new boolean[n+1];

        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.print(", " +i);
            }

        }

    }
}
