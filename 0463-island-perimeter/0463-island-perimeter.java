class Solution {
    static boolean check(int i,int j,int[][] arr){
        return ((i>=0 && i<arr.length) && (j>=0 && j<arr[0].length));
    }
    static int find(int i,int j,HashMap<String,Integer> map,int[][] arr){
        int sum=4;
        if(map.containsKey(String.valueOf(i)+"_"+String.valueOf(j))) sum+=map.get(String.valueOf(i)+"_"+String.valueOf(j));
        if(check(i+1,j,arr) && arr[i+1][j]==1){
            if(map.containsKey(String.valueOf(i+1)+"_"+String.valueOf(j))){
                map.put(String.valueOf(i+1)+"_"+String.valueOf(j),map.get(String.valueOf(i+1)+"_"+String.valueOf(j))-2);
            }
            else map.put(String.valueOf(i+1)+"_"+String.valueOf(j),-2);
        }
          if(check(i,j+1,arr) && arr[i][j+1]==1){
            if(map.containsKey(String.valueOf(i)+"_"+String.valueOf(j+1))){
                map.put(String.valueOf(i)+"_"+String.valueOf(j+1),map.get(String.valueOf(i)+"_"+String.valueOf(j+1))-2);
            }
            else map.put(String.valueOf(i)+"_"+String.valueOf(j+1),-2);
        }
        return sum;
    }
    public int islandPerimeter(int[][] grid) {
       HashMap<String,Integer> map=new HashMap<>();
       int sum=0;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                sum+=find(i,j,map,grid);
            }
        }
       }
       return sum; 
    }
}