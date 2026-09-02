class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        for(int num : nums){
            eleSum += num;
            digitSum += digSum(num);
        }
        return Math.abs(eleSum - digitSum);
    }
    private static Integer digSum(int n){
        int temp = n;
        int sum = 0; 
        while(temp > 0){
            int lastDig = temp % 10;
            sum += lastDig;
            temp /= 10;
        }
        return sum;
    }
}