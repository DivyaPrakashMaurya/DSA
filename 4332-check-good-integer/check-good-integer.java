class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sqSum = 0;
        while(n > 0){
            int lastDig = n % 10;
            sum += lastDig;
            sqSum += lastDig * lastDig;
            n = n /10;
        }
        if(sqSum - sum >= 50){
            return true;
        }
        return false;
    }
}