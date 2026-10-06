class Solution {
    public int[] countBits(int n) {
       int[] ans = new int[n + 1];
       for(int i = 0; i <= n; i++){
        ans[i] = NoBit(i);
       }
       return ans;
    }
    private static Integer NoBit(int m){
        int count = 0;
        while(m != 0){
            m = m & (m-1);
            count ++;
        }
        return count;
    }
}