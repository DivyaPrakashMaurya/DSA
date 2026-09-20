class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int number = s.charAt(i) - 'a' + 1;
            sum += (27-number) * (i+1);
        }
        return sum;
    }
}