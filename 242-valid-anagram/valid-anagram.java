class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> h = new HashMap<>();

        for(char c:s.toCharArray()){
            h.put(c , h.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            // if(!h.containsKey(c)){
            //     return false;
            // }
            // else if(h.get(c)==0){
            //     return false;
            // }
            // else{
            //     h.put(c,h.get(c)-1);
            // }
            h.put(c , h.getOrDefault(c,0)-1);
        }

        for(int count:h.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}