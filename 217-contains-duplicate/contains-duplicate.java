class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int num : nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }

        for(int count:h.values()){
            if(count>1){
                return true;
            }
        }
        return false;
    }
}