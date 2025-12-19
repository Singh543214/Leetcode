class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int k=1;
        while(k<=memory1 || k<=memory2){
            if(memory1>=memory2){
                memory1-=k;
            }else{
                memory2-=k;
            }
            k++;
        }
        return new int[]{k,memory1,memory2};
    }
}