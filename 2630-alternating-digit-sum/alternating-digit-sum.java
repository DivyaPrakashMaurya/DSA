class Solution {
    public int alternateDigitSum(int n) {
        int count = 1;
        int sum = 0;
        String s = String.valueOf(n);
        for(int i=0; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            if(count % 2 == 0){
                sum += -digit;
            }else{
                sum += digit;
            }
            count++;
        }
        return sum;
    }
}