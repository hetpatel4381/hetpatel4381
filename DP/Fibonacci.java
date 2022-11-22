public class Fibonacci {

    //Memoization code O(n) ans in recursin O(2^n);
    //space -> O(n) + O(n) as using dp and stack space of recursion;
    public static int fib(int n, int[] f){
        if(n == 0 || n == 1) return n;
        if(f[n] != 0) return f[n];
        return f[n] = fib(n-1, f) + fib(n-2, f);
    }
    public static void main(String[] args) {
        int n = 8;
        int[] f = new int[n + 1]; 
        System.out.println(fib(n, f));
    }
}
