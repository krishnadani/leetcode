class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long slargest = Long.MIN_VALUE;
        long tlargest = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == largest || num == slargest || num == tlargest) {
                continue;
            }

            if (num > largest) {
                tlargest = slargest;
                slargest = largest;
                largest = num;
            } else if (num > slargest) {
                tlargest = slargest;
                slargest = num;
            } else if (num > tlargest) {
                tlargest = num;
            }
        }

        return tlargest == Long.MIN_VALUE ? (int) largest : (int) tlargest;
    }
}