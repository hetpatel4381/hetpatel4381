public class Climbing_Stairs {

    //Recursion code time -> O(2^n)
    // space -> O(n) using recusions stack space
    public static int climb(int n){
        if(n == 0) return 1;
        if(n < 0) return 0;
        return climb(n-1) + climb(n-2);
    }

    //Memoization code time -> O(n)
    //space -> O(n) + O(n) reusrion stack space + array of dp
    public static int climbMemo(int n, int dp[]){
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(dp[n] != 0) return dp[n];

        return dp[n] = climbMemo(n - 1, dp) + climbMemo(n - 2, dp);
    }

    //Tabulation code time -> O(n)
    //space -> O(n) using array as dp for space
    public static int climbTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    //Space Optimization time -> O(n)
    //space -> O(1)
    public static int climbSpace(int n){
        int prev = 1;
        int curr = 1;
        for(int i=2; i<=n; i++){
            int ans = prev + curr;
            prev = curr;
            curr = ans;
        }
        return curr;
    }
    public static void main(String[] args) {
        int n = 7;
        int dp[] = new int[n+1];
        System.out.println(climb(n));
        System.out.println(climbMemo(n, dp));
        System.out.println(climbTab(n));
        System.out.println(climbSpace(n));
    }
}
