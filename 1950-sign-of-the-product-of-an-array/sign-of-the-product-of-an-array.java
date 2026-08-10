class Solution {

    public int signFunc(int product){
        if(product<0){
            return -1;
        }
        else if(product==0){
            return 0;
        }
        else{
            return 1; 
        }
    }
    public int arraySign(int[] nums) {
        int prod = 1;
       for(int i=0 ; i<nums.length ; i++){
        prod = prod * signFunc(nums[i]);
       } 

       int result = signFunc(prod);

       return result;
    }
}