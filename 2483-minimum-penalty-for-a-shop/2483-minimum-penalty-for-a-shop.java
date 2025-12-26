class Solution {
    public int bestClosingTime(String customers) {
       int n= customers.length();
       int[] open=new int[n+1];
       int[] close=new int[n+1];
 
       for(int i=0;i<n;i++){
        if(customers.charAt(i)=='Y') open[i]=1;
        else close[i+1]=1;
       }

       for(int i=n-1;i>=0;i--){
        open[i]+=open[i+1];
       }

       int min=Integer.MAX_VALUE;
       min=Math.min(min,(open[0]+close[0]));

       for(int i=1;i<=n;i++){
        close[i]+=close[i-1];
        min=Math.min(min,(open[i]+close[i]));
       }

       

    //    for(int i=0;i<=n;i++){
    //     min=Math.min(min,(open[i]+close[i]));
    //     System.out.println(open[i]+" "+close[i]);
    //    }
       for(int i=0;i<=n;i++){
        if(open[i]+close[i]==min) return i;
       }
       return 0;
    }
}