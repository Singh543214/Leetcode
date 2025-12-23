class Solution {
    static int check(int[] nums,int count){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return -1;
        }
         return count;
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
        int i=0,j=2;
        int count=0;
        while(j<n && (j-i)==2){
            if(nums[i]==0){
                nums[i]=1;
                nums[i+1]=(nums[i+1]==0)?1:0;
                nums[i+2]=(nums[i+2]==0)?1:0;
                count++;
            }
            i++;
            j++;
        }

        return check(nums,count);
    }
}