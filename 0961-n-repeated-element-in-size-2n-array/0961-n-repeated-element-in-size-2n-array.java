class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;   
        Arrays.sort(nums);
        return (nums[n/2]==nums[(n/2)+1])? nums[(nums.length)/2]:nums[(n/2)-1];
    }
}