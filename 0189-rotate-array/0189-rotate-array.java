class Solution {
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    static void reverse(int[] arr,int s,int e){
        if(s>e) return;
        swap(arr,s,e);
        reverse(arr,s+1,e-1);    
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        reverse(nums,0,n-k);
        reverse(nums,n-k+1,n);
        reverse(nums,0,n);
    }
}