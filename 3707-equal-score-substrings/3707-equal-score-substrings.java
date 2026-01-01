class Solution {
    public boolean scoreBalance(String s) {
        int[] prefix=new int[s.length()];
        int n=prefix.length-1;
        for(int i=0;i<s.length();i++){
            prefix[i]=(i<1) ? s.charAt(i)-96:prefix[i-1]+s.charAt(i)-96;
            //System.out.print(prefix[i]+" ");
        }
        for(int i=0;i<=n;i++){
            if(prefix[i]==(prefix[n]-prefix[i])) return true;
        }


        return false;
    }
}