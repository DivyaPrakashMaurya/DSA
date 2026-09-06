class Solution {
    public int thirdMax(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            int minPos = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[minPos] < nums[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
        int count= 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                count++;
            }
            if(count == 3){
                return nums[i];
            }
        }
        return nums[0];
    }
}