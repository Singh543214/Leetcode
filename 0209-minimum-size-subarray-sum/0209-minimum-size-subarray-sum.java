class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int length=Integer.MAX_VALUE;
        int sum=0;
        while(j<nums.length){
            sum+=nums[j];
                while(sum>=target){
                length=Math.min(length,(j-i+1));
                sum-=nums[i];
                i++;
                }
                 j++;
            
            System.out.println(sum);
        }
        System.out.println(i+" "+j);
        
        return (length==Integer.MAX_VALUE)?0:length;
    }
}