class Solution {
    public int[] productExceptSelf(int[] nums) {
        long total_p=1;
        int zero=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) total_p*=nums[i];
            else zero++;
        }

        for(int i=0;i<nums.length;i++){

            if(zero>1){
              nums[i]=0;
            }

            else if(zero==0) nums[i]=(int)total_p/nums[i];

            else{
                if(nums[i]==0) nums[i]=(int)total_p;
                else nums[i]=0;
            }
            
        }
        return nums;
    }
}