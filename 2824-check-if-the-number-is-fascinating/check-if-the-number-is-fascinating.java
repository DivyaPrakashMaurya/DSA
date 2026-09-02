class Solution {
    public boolean isFascinating(int n) {
        int a = 2 * n;
        int b = 3 * n;
       String s = String.valueOf(n) + a + b;
       if(s.length() != 9){
        return false;
       }
       boolean[] seen = new boolean[10];
       for(int i = 0; i < s.length(); i++){
        int digit = s.charAt(i) - '0';
        if(digit == 0 || seen[digit]){
            return false;
        }
        seen[digit] = true;
       }
       return true;
    }
}