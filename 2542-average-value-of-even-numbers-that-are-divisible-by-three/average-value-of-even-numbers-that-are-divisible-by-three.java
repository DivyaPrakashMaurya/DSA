class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int num : nums){
            if(isDiv(num)){
                sum += num;
                count++;
            }
        }
        if(count != 0){
            return (sum/count);
        }
        return sum;
    }
    private static Boolean isDiv(int n){
        if(n % 3 == 0 && n % 2 ==0 ){
            return true;
        }
        return false;
    }
}