class Solution {
    static int count(int n){
        if(n<3) return 0;
        return 1+count(n-1);
    }
    public int distinctIntegers(int n) {
        int count=1;
        return count+count(n);
    }
}