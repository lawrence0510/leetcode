// https://leetcode.com/problems/unique-paths

class Solution {
    public static long uniquePaths(int m, int n) {
        long ans = 1;
        long max = Math.max(m, n);
        long min = Math.min(m, n);
        // (m+n-2)!/(m-1)!/(n-1)!
        for(long i = m+n-2 ; i > max-1 ; i--){
            ans = ans * i;
        }
        for(long i = 2; i <= min-1; i++){
            ans = ans / i;
        }
        return ans;
    }
}