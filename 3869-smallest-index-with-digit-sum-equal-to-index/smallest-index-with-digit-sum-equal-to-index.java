class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i == DigSum(nums[i])){
                return i;
            }
        }
        return -1;
    }
    private static Integer DigSum(int n){
        int sum = 0;
        while(n > 0){
            int Dig = n % 10;
            sum += Dig;
            n =  n/10;
        }
        return sum;
    }
}