class Solution {
    public boolean judgeCircle(String moves) {

        char[] move = moves.toCharArray();

        int x=0;
        int y=0;

        for(int i=0 ; i<move.length ; i++){
        if(move[i] == 'U'){
            x++;
        }
        else if(move[i] == 'D'){
            x--;
        }
        else if(move[i] == 'L' ){
            y++;
        }
        else if(move[i] == 'R'){
            y--;
        }
        }
        return x==0 && y==0;
    }
}