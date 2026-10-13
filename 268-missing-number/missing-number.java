class Solution {
    public int missingNumber(int[] nums) {
        
        int xor1=0;
        int xor2=0;

        for(int i=0 ; i<=nums.length-1 ; i++){
            xor1 = xor1 ^ nums[i];
        }

        for(int j=1 ; j<=nums.length ; j++){
            xor2 = xor2 ^ j;
        }

        int xor = xor1 ^ xor2;

        return xor;
    }
}