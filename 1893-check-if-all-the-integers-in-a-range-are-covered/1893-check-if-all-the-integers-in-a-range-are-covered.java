class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] prefix=new int[52];
        for(int[] arr: ranges){
            int start=arr[0],end=arr[1];
            prefix[start]+=1;
            prefix[end+1]-=1;
        }
        for(int i=1;i<prefix.length;i++){
            prefix[i]+=prefix[i-1];
        }
        for(int i=left;i<=right;i++){
            if(prefix[i]<=0) return false;
        }
        return true;
    }
}