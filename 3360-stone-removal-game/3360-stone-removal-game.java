class Solution {
    public boolean canAliceWin(int n) {
        int c=10;
        int count=0;
        while(n-c >= 0){
            count++;
            n-=c;
            c--;
        }
        return count%2==1;
    }
}