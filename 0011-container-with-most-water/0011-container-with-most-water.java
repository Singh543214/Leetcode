class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
       while(i<=j){
        int width=(j-i);
        int high=Math.min(height[i],height[j]);
        max=Math.max(max,width*high);
        if(height[i]<=height[j]){
            i++;
        }
        else{
            j--;
        }
       }
       return max; 
    }
}