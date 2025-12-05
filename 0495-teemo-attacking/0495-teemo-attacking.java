class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n=timeSeries.length;
        int count=duration;
        for(int i=0;i<n-1;i++){
           int x=Math.abs(timeSeries[i+1]-timeSeries[i]);
            if(x>=duration) count+=duration;
            else count+=x;
        }
        return count;
    }
}