class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length,max=0;
        Arrays.sort(nums);
      // if (nums[0]==nums[n-1]) return n;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
        else map.put(nums[i],1);
       }
       for(int i=n-1;i>0;i--){
        if(nums[i]-nums[i-1] ==1) max=Math.max(max,(map.get(nums[i])+map.get(nums[i-1])));
       }
       return max;

    }
}