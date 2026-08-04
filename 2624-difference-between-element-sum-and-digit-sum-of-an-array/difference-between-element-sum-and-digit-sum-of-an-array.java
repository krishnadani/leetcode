class Solution {
    public int differenceOfSum(int[] nums) {
        int arrSum = 0;
        for(int i=0 ; i<nums.length ; i++){
            arrSum = arrSum + nums[i];
        }

        int rem=0;
        for(int j=0 ; j<nums.length ; j++){
            int arrEle=nums[j];
            while(arrEle>0){
                rem= rem+(arrEle%10);
                arrEle = arrEle/10;
            }
        }
        return Math.abs(arrSum - rem);
    }
}