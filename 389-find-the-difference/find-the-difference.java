class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character,Integer> count = new HashMap<>(); 
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        for(Character c : a ){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for(Character d : b ){
            count.put(d,count.getOrDefault(d,0)-1);

            if(count.get(d)<0){
                return d;
            }
        }
        
        return ' ';
    }
}