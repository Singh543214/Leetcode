class Solution {
    static boolean check(int a){
        return a>=0;
    }
    static int give(int[] player,int i){
        if(check(i-2) && player[i-2]==10) return player[i]*2;
        else if(check(i-1) && player[i-1]==10) return player[i]*2;
        return player[i];
    }
    public int isWinner(int[] player1, int[] player2) {
        int sum1=0,sum2=0;
        for(int i=0;i<player1.length;i++){
          sum1+=give(player1,i);
          sum2+=give(player2,i);
        }
        if(sum1>sum2) return 1;
        if(sum2>sum1) return 2;
        return 0;
    }
}