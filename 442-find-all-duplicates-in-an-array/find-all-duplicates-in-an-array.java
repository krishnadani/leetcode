class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashMap<Integer , Integer> h = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for(int c : nums){
            h.put(c,h.getOrDefault(c,0)+1);
        } 

        for(int key : h.keySet()){
            if(h.get(key) >1){
                l.add(key);
            }
        }
        return l;
    }
}