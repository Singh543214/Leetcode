class Solution {
    public int smallestNumber(int n) {
         if(n==1){
            return 1;
        }
        int a=(int)Math.ceil((Math.log(n)/Math.log(2)));
        if((n&(n-1))==0) a++;
        return (1<<a)-1;
    }
}