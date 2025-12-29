class NumMatrix {
    int[][] grid;
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        grid=new int[matrix.length][matrix[0].length];
        prefix=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                this.grid[i][j]=matrix[i][j];
                if(j<1) prefix[i][j]=matrix[i][j];
                else prefix[i][j]=prefix[i][j-1]+matrix[i][j];

             //   System.out.print(prefix[i][j]+" ");
            }
            //System.out.println();
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       int sum=0;
       for(int i=row1;i<=row2;i++){
        sum=(col1>0)?(sum+prefix[i][col2]-prefix[i][col1-1]):(sum+prefix[i][col2]);
       }
       return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */