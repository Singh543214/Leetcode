int climbStairs(int n) {
    if(n==1 || n==2 || n==3) return n;
    else{
        int x=2,y=3,z;
        for(int i=4;i<=n;i++){
            z=x+y;
            x=y;
            y=z;
        }
        return y;
    }
}