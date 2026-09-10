class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);

            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            }
            return Integer.compare(b, a);
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}