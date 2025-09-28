class Solution {
    public int largestPerimeter(int[] nums) {
     Arrays.sort(nums);
     for(int i=nums.length-3;i>=0;i--){
        int a=nums[i+2],b=nums[i+1],c=nums[i];
        if(a<(b+c) && b<(a+c) && c<(a+b)){
            return a+b+c;
        }
     }
     return 0;   
    }
}