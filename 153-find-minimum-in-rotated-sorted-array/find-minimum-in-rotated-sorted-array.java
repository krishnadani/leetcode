class Solution {
    public int findMin(int[] nums) {
        
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int mid = low + (high-low)/2;

            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                //nums[mid]<nums[high]
                //then that is the min or ans
                high=mid;
            }
        }
        return nums[low];
    }
}