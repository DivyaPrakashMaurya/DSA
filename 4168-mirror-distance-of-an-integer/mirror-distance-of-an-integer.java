class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int reverse = 0;
        while(temp != 0){
            int Dig = temp % 10;
            reverse = reverse * 10 + Dig;
            temp /= 10;
        }
        return Math.abs(n - reverse);
    }
}