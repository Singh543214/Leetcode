class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int count=1,k=0;
        int[][] arr=new int[rows*cols][2];
       int[] temp=new int[2];
       arr[0][0]=rStart;
       arr[0][1]=cStart;
       int x=1;
       while(k<=(rows*cols)-2){
        for(int i=0;i<count;i++){
            cStart++;
           if((rStart>=0 && rStart<=rows-1) &&(cStart>=0 && cStart<=cols-1)){
            arr[x][0]=rStart;
            arr[x][1]=cStart;
            x++;
            System.out.println(rStart+","+(cStart));
           }
           
            
        }
         System.out.println();
        for(int i=0;i<count;i++){
            rStart++;
            
           if((rStart>=0 && rStart<=rows-1) &&(cStart>=0 && cStart<=cols-1)){
             arr[x][0]=rStart;
            arr[x][1]=cStart;
            x++;
            System.out.println(rStart+","+(cStart));
           }
           
            
        }
         System.out.println();
        count++;
        for(int i=0;i<count;i++){
             cStart--;
            
           if((rStart>=0 && rStart<=rows-1) &&(cStart>=0 && cStart<=cols-1)){
             arr[x][0]=rStart;
            arr[x][1]=cStart;
            x++;
            System.out.println(rStart+","+(cStart));
           }
           
        }
         System.out.println();
        for(int i=0;i<count;i++){
             rStart--;
            
           if((rStart>=0 && rStart<=rows-1) &&(cStart>=0 && cStart<=cols-1)){
             arr[x][0]=rStart;
            arr[x][1]=cStart;
            x++;
            System.out.println(rStart+","+(cStart));
           }
           
        }
         System.out.println();
        count++;
        k++;
       }
       

        return arr;
    }
}