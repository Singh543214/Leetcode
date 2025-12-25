class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int len_inc=1,len_dec=1,max=1;

        for(int i=1;i<nums.length;i++){


            if(nums[i]>nums[i-1]){
                len_inc++;
                max=Math.max(max,Math.max(len_inc,len_dec));
                len_dec=1;
            }
            
            else if(nums[i]<nums[i-1]){
                len_dec++;
                max=Math.max(max,Math.max(len_inc,len_dec));
                len_inc=1;
            }
            
            else{
                max=Math.max(max,Math.max(len_inc,len_dec));
                len_inc=1;
                len_dec=1;
            }
            
        }
        return max;
    }
}