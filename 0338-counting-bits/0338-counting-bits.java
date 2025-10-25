class Solution {
    static int count(int n,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=0) return dp[n];
        if(n%2==0) dp[n]=count(n/2,dp);
        else dp[n]=1+count(n/2,dp);
        return dp[n];
    }
    
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        int[] dp=new int[100000];
        for(int i=0;i<=n;i++){
            arr[i]=count(i,dp);
        }
        return arr;
    }
}