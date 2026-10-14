class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer , Integer> h = new HashMap<>();

        for(int num : nums){
            if(h.containsKey(num)){
                return num;
            }
            h.put(num,1);
        }

        return -1;
    }
}