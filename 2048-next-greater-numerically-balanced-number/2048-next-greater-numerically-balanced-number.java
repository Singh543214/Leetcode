class Solution {
    static boolean check(int n){
        int[] arr=new int[10];
        while(n!=0){
           arr[n%10]++;
           n/=10; 
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && arr[i]!=i) return false;
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=1224444;i++){
            if(check(i)) return i;
        }
        return 1224444;
    }
}