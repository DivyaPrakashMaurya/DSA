class Solution {
    public boolean checkGoodInteger(int n) {
        int temp = n;
        int sum = 0;
        int sqSum = 0;
        while(temp > 0){
            int lastDig = temp % 10;
            sum += lastDig;
            sqSum += lastDig * lastDig;
            temp = temp /10;
        }
        if(sqSum - sum >= 50){
            return true;
        }
        return false;
    }
}