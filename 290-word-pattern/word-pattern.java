class Solution {
    public boolean wordPattern(String pattern, String s) {

        char[] c = pattern.toCharArray();
        String[] sentence = s.split(" "); 

        if(c.length != sentence.length){
            return false;
        }

        HashMap<Character,String> mapPS = new HashMap<>();
        HashMap<String , Character> mapSP = new HashMap<>();

        for(int i=0 ; i<c.length ; i++){
            char charC = c[i];
            String wordS = sentence[i];

            if(mapPS.containsKey(charC) && !mapPS.get(charC).equals(wordS)){
                return false;
            }

            if(mapSP.containsKey(wordS) && mapSP.get(wordS)!=charC){
                return false;
            }
            mapPS.put(charC, wordS);
            mapSP.put(wordS, charC);
        }
        return true;
    }
}