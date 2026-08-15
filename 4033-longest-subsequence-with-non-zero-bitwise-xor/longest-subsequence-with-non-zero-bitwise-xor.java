class Solution {
    public int longestSubsequence(int[] nums) {
        
        int xor=0;
        boolean hasNonZero = false;

        for(int i = 0 ; i<nums.length ; i++){

            xor = xor ^ nums[i];

            if(nums[i] != 0 ){
                hasNonZero = true;
            }
        }

         if(xor != 0 ){
            return nums.length;
         }   

        return hasNonZero ? nums.length-1 : 0 ;  
    }
}