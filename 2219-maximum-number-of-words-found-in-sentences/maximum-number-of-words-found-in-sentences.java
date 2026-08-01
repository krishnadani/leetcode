class Solution {
    public int mostWordsFound(String[] sentences) {
        
        if(sentences==null || sentences.length==0){
            return 0;
        }

        int wordCount=0;
        for( String s : sentences){
    
        String[] words = s.trim().split("\\s+");
        wordCount =Math.max(wordCount, words.length); 

        }

        return wordCount;
    }
}