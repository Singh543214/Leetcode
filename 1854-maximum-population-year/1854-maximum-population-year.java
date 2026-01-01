class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] prefix=new int[2052];
        int max=Integer.MIN_VALUE;
        for(int[] arr: logs){
            int x=arr[0],y=arr[1];
            prefix[x]+=1;
            prefix[y]-=1;
        }
        for(int i=1950;i<2052;i++){
            prefix[i]+=prefix[i-1];
            max=Math.max(max,prefix[i]);
        }
        for(int i=1950;i<2052;i++){
            if(prefix[i]==max) return i;
        }
        return 0;
    }
}