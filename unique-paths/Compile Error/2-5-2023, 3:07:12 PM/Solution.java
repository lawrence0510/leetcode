// https://leetcode.com/problems/unique-paths

class Solution {
    public static long uniquePaths(int m, int n) {
        long ans = 1;
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        // (m+n-2)!/(m-1)!/(n-1)!
        for(int i = m+n-2 ; i > max-1 ; i--){
            ans = ans * i;
        }
        for(int i = 2; i <= min-1; i++){
            ans = ans / i;
        }
        return ans;
    }
}