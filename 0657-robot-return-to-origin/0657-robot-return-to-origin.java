class Solution {
    public boolean judgeCircle(String moves) {
        if((moves.length())%2==1) return false;
        int countUp=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U' || moves.charAt(i)=='R') countUp++;
            else countUp--;
        }
        if(countUp==0) return true;
        return false;
    }
}