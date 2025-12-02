class Solution {
    public boolean judgeCircle(String moves) {
        if((moves.length())%2==1) return false;
        int countUp=0,countRight=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') countUp++;
            else if(moves.charAt(i)=='D') countUp--;
            else if(moves.charAt(i)=='R') countRight++;
            else countRight--;
        }
        if(countUp==0 && countRight==0) return true;
        return false;
    }
}