class Solution {
    static boolean check(int a,int b,int m,int n){
        if((a>=0 && a<m) && (b>=0 && b<n)) return true;
        return false;
    }
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
         int[][] next = new int[m][n];
         
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int[] arr=new int[8];
                int sum=0;
                arr[0]=check(i-1,j-1,m,n)?board[i-1][j-1]:0;
                arr[1]=check(i-1,j,m,n)?board[i-1][j]:0;
                arr[2]=check(i-1,j+1,m,n)?board[i-1][j+1]:0;
                arr[3]=check(i,j-1,m,n)?board[i][j-1]:0;
                arr[4]=check(i,j+1,m,n)?board[i][j+1]:0;
                arr[5]=check(i+1,j-1,m,n)?board[i+1][j-1]:0;
                arr[6]=check(i+1,j,m,n)?board[i+1][j]:0;
                arr[7]=check(i+1,j+1,m,n)?board[i+1][j+1]:0;
              for(int k=0;k<8;k++){
                    if(arr[k]==1) sum++;
                }
                if(sum < 2 || sum > 3) next[i][j] = 0;
                else if(sum == 3) next[i][j] = 1;
                else next[i][j] = board[i][j];
            }
        }

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j] = next[i][j];
            }
        }

    }
}