class Solution {
    public int distinctSubseqII(String s) {
        int mod = 1_000_000_007;
        int n = s.length();

        long[] dp = new long[n + 1];
        dp[0] = 1; 

        long[] lastSeen = new long[26];
        
        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            
            dp[i] = (dp[i - 1] * 2) % mod;
            
            int idx = c - 'a';
            dp[i] = (dp[i] - lastSeen[idx] + mod) % mod;
            
            lastSeen[idx] = dp[i - 1];
        }
        
        return (int)((dp[n] - 1 + mod) % mod);
    }
}