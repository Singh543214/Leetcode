class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        for(int i=k,j=0;i<nums.length;i++,j++){
            sum=(double)Math.max(sum,(sum-(nums[j]-nums[i])));
        }
        return sum/(double)k;
    }
}