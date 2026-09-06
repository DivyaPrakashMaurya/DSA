class Solution {
    public int maxProduct(int n) {
        int temp = n;
        ArrayList<Integer> list = new ArrayList<>();

        while (temp > 0) {
            int dig = temp % 10;
            list.add(dig);
            temp = temp / 10;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int product = list.get(i) * list.get(j);

                if (product > max) {
                    max = product;
                }
            }
        }

        return max;
    }
}
