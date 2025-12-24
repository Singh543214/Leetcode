class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length,m=capacity.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=apple[i];
        }
        System.out.println(sum);
        Arrays.sort(capacity);
        int j=m-1,count=0;
        while(sum>0 && j>=0){
            sum-=capacity[j];
            count++;
            j--;
        }
        return count;
    }
}