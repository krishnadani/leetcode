class Solution {
    public int countKeyChanges(String s) {
        String lowerCase = s.toLowerCase();
        char[] arrOfLowerCaseChar = lowerCase.toCharArray();
        int count=0;
        for(char i=1 ; i<arrOfLowerCaseChar.length ; i++){
            if(arrOfLowerCaseChar[i-1]!=arrOfLowerCaseChar[i]){
                count++;
            }
        }
        return count;
    }
    
}