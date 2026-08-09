class Solution {
    public boolean isOdd(int[] arr, int idx) {
        return arr[idx] % 2 != 0;
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        while (i + 2 < arr.length) {
            if (isOdd(arr, i) && isOdd(arr, i + 1) && isOdd(arr, i + 2)) {
                return true;
            }
            i++;
        }

        return false;
    }
}