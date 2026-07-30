class Solution {
    public int subsetXORSum(int[] nums) {
        int bitwiseOR=0;
        for(int num : nums){
            bitwiseOR = bitwiseOR | num;
        }
        return bitwiseOR << (nums.length-1);
    }
}