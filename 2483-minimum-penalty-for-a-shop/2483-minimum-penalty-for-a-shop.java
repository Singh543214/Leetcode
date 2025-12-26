class Solution {
    public int bestClosingTime(String customers) {
       int n= customers.length();
       int c=0,d=0;
       int min=Integer.MAX_VALUE;

       for(int i=0;i<n;i++){
        if(customers.charAt(i)=='Y') c++;
       }

       int x=c;
      
       for(int i=0;i<=n;i++){
        min=Math.min(min,(c+d));
        c=(i<n && customers.charAt(i)=='Y')?(c-1):c;
        d=(i<n && customers.charAt(i)=='N')?(d+1):d;
       }

       d=0;
       c=x;
       
       for(int i=0;i<=n;i++){
        if(c+d==min) return i;
        c=(i<n && customers.charAt(i)=='Y')?(c-1):c;
        d=(i<n && customers.charAt(i)=='N')?(d+1):d;
       }

       return 0;
    }
}