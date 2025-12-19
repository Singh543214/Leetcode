class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=(long)chalk[i];
        }
        System.out.println(sum);
        long x=(long)k%sum;
        k=(int)x;
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]<=k) k-=chalk[i];
            else return i; 
        }
        return 0;
    }
}