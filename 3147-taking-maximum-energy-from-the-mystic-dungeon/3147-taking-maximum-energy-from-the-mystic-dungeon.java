class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max=Integer.MIN_VALUE;
      for(int i=energy.length-1;i>=0;i--){
        if(i-k >=0) energy[i-k]+=energy[i];
        max=Math.max(max,energy[i]);
        System.out.println(max);
      }
      return max;
    }
}