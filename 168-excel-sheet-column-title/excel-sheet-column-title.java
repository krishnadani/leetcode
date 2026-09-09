class Solution {
    public String convertToTitle(int columnNumber) {
        
        int n = columnNumber;
        StringBuilder res = new StringBuilder();

        while(n>0){
            int rem = (n-1) % 26 ;
            char ch = (char) ('A' +  rem);

            res.append(ch);

            n = (n-1)/26;
        }

        res.reverse();

        return res.toString();
    }
}