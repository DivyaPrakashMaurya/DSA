class Solution {
    public String addBinary(String a, String b) {
        int m = a.length()-1;
        int n = b.length()-1;

        StringBuilder res = new StringBuilder();
        int carry = 0;

        while(m >= 0 || n >= 0){
            int sum = carry;
            if(m >= 0){
                sum += a.charAt(m) -'0';
                m--;
            }
            if(n >= 0){
                sum += b.charAt(n) -'0';
                n--;
            }
            res.append(sum % 2);
            carry = sum/2;
        }

        if(carry == 1){
            res.append('1');
        }
        return res.reverse().toString();
    }
}