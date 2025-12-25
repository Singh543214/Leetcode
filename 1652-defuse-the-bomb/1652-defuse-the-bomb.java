class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;

        if(k==0) {
            int[] slide=new int[n];
            return slide;
        }

        int[] slide=new int[2*n];
        for(int i=0;i<slide.length;i++){
            slide[i]=code[i%n];
        }
        if(k>0){
            int sum=0;
           for(int i=1;i<=k;i++){
            sum+=slide[i];
           }
      
             for (int i = 0; i < n; i++) {
                code[i] = sum;
                sum = sum - slide[i + 1] + slide[i + k + 1];
            }

        }
        else{
            k=-k;
            int sum=0;
            for(int i=n-1;i>=(n-k);i--){
                sum+=slide[i];
            }
            for(int i=0;i<code.length;i++){
                code[i]=sum;
                sum = sum - slide[i + n - k] + slide[i + n];
            }
        }
       
        return code;
        
    }
}