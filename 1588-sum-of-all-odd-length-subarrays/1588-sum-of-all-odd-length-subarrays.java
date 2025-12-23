class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int total=(i+1)*(n-i);
            int x=(total%2==0)?total/2:(total/2)+1;
            sum+=arr[i]*x;
        }
        return sum;
    }
}