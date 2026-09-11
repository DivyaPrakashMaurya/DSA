class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];

        for (int digit : digits) {
            count[digit]++;
        }

        int result = 0;

        for (int num = 100; num <= 998; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % 10;


            int[] needed = new int[10];
            needed[hundreds]++;
            needed[tens]++;
            needed[ones]++;

            boolean possible = true;

            for (int d = 0; d <= 9; d++) {
                if (needed[d] > count[d]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                result++;
            }
        }

        return result;
    }
}
