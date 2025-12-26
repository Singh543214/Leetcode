class Solution {
    public int bestClosingTime(String customers) {
       int n= customers.length();
       int[] open=new int[n+1];
 
       for(int i=0;i<n;i++){
        if(customers.charAt(i)=='Y') open[i]=1;
       }

       for(int i=n-1;i>=0;i--){
        open[i]+=open[i+1];
       }

       int min=Integer.MAX_VALUE;
       int d=0;

       for(int i=0;i<=n;i++){
        min=Math.min(min,(open[i]+d));
        d=(i<n && customers.charAt(i)=='N')?(d+1):d;
       }
       d=0;
       for(int i=0;i<=n;i++){
        if(open[i]+d==min) return i;
        d=(i<n && customers.charAt(i)=='N')?(d+1):d;
       }

       return 0;
    }
}