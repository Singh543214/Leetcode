class Solution {
    public int clumsy(int n) {
       int sum=0; 
       for(int i=n;i>0;i-=4){
            int x=(i<n)?-i:i;
            int y=((i-1)>0)?(i-1):1;
            int z=((i-2)>0)?(i-2):1;
            sum+=(int)(x*y)/z;
            int a=((i-3)>0)?(i-3):0;
            sum+=a;
            System.out.println(x+" "+y+" "+z+" "+a);
       }
       return sum;
    }
}