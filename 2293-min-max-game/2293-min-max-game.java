class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] arr = Arrays.copyOf(nums, nums.length);
        while(arr.length!=1){
            for(int i=0;i<arr.length/2;i++){
                if(i%2==0) arr[i]=Math.min(arr[i*2],arr[i*2+1]);
                else arr[i]=Math.max(arr[i*2],arr[i*2+1]);
            }
            arr=Arrays.copyOf(arr,arr.length/2);
        }
        return arr[0];

    }
}