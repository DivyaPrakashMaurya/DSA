class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = sum(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
    private static Integer sum(int n){
        int sum = 0;
        while(n > 0){
            int dig = n % 10;
            sum += dig;
            n = n/10;
        }
        return sum;
    }
}