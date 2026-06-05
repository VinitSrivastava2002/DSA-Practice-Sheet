package Math;

public class sqRoot {
    public static void main(String[] args) {
        int n=40;
        System.out.println(sqroot(n,3));
    }

    // use binary search for finding square root
    public static double sqroot(int n,int d){
        int s=1;
        int e=n;
        double root = 0.0;
        // check between 0 to n
        while(s<=e){
            int m = s + (e-s)/2;

            // base condition
            if(m*m==n){
                return m;
            }
            if(m*m<n){
                s=m+1;
            } else {
                e=m-1;
            }
        }
        root = root+e;

        double incre = 0.1;

        for(int i=0;i<d;i++){
            while(root*root<=n){
                root+=incre;
            }
            root-=incre;
            incre/=10;
        }
        return root;
    }
}
