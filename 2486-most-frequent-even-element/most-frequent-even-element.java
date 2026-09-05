class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int ans = -1;

        for (int c : h.keySet()) {
            if (c % 2 == 0) {
                int freq = h.get(c);
                if (freq > maxFreq || (freq == maxFreq && c < ans)) {
                    maxFreq = freq;
                    ans = c;
                }
            }
        }

        return ans;
    }
}