class Solution {
    public int maxFreqSum(String s) {
        
        char[] letters = s.toCharArray();

        HashMap<Character , Integer> h = new HashMap<>();

        for(char c: letters){
            h.put(c,h.getOrDefault(c,0)+1);
        } 

        int vowel=0;
        int consonants=0;
        for(char d : h.keySet()){
            int count = h.get(d);
            if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u'){
                vowel = Math.max(vowel , count);
            }
            else{
                consonants = Math.max(consonants , count);
            }
        }

        return vowel+consonants;
    }
}