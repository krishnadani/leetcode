class Solution {
    public int xorOperation(int n, int start) {
        
        int []nums  = new int[n];
        for(int i=0 ; i<nums.length ; i++){
            nums[i]=start+i*2;
        }
        int xor=0;
        for(int i=0 ; i<nums.length ; i++){
            xor = xor ^ nums[i];
        }
        return xor; 
    }
}