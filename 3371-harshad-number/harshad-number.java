class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        while(temp > 0){
            int lastDig = temp % 10;
            sum += lastDig;
            temp = temp / 10;
        }
        if(x % sum == 0){
            return sum;
        }
        return -1;
    }
}