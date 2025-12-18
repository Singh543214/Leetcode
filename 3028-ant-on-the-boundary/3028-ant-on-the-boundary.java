class Solution {
    public int returnToBoundaryCount(int[] nums) {
      int addp=0,addn=0,count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0) addp+=nums[i];
        else addn+=nums[i];  
        if(addp!=0 && addp+addn==0) count++;
      }
      return count;  
    }
}