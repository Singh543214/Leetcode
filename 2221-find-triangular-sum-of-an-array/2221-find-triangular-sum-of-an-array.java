class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length<2) return nums[0];
        int k=nums.length-1;
        while(k!=0){
            for(int i=0;i<k;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            k--;
        }
        return nums[0];
    }
}