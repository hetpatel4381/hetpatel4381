public class Fibonacci {

    //Memoization code O(n) ans in recursin O(2^n);
    //space -> O(n) + O(n) as using dp and stack space of recursion;
    public static int fib(int n, int[] f){
        if(n == 0 || n == 1) return n;
        if(f[n] != 0) return f[n];
        return f[n] = fib(n-1, f) + fib(n-2, f);
    }

    //tabulation method Time -> O(n)
    //space -> O(n) since it is not using extra recursion space
    public static int Tab(int n){
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2; i<=n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
    public static void main(String[] args) {
        int n = 8;
        int[] f = new int[n + 1]; 
        System.out.println(fib(n, f));
        System.out.println(Tab(n));
    }
}
