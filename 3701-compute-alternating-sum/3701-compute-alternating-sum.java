class Solution {
    public int alternatingSum(int[] nums) {
        int even=0,odd=0;
        for(int i=0;i<nums.length;i++){
            even=(i%2==0)?(even+nums[i]):(even+0);
            odd=(i%2==1)?(odd+nums[i]):(odd+0);
        }
        return even-odd;
    }
}