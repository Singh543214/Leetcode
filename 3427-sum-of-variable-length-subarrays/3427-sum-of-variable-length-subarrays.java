class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[nums.length];
        int sum=0,start=0;
        for(int i=0;i<n;i++){
           prefix[i]=(i<1)?nums[i]:prefix[i-1]+nums[i];
           start=Math.max(0,i-nums[i]);
           sum+=(start<1)?prefix[i]:prefix[i]-prefix[start-1];
        }
        return sum;
    }
}