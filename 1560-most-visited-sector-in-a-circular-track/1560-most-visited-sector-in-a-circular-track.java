class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
       List<Integer> li=new ArrayList<>(); 
       int[] arr=new int[n];
       arr[rounds[0]-1]=1;
       int max=1;
       for(int i=0;i<rounds.length-1;i++){
        int x=rounds[i]-1;
        int y=rounds[i+1]-1;
        int z=(y<x)?(n-1-x +y+1):(y-x);
        for(int j=1;j<=z;j++){
            arr[(j+x)%n]++;
            max=Math.max(arr[(j+x)%n],max);
        }
       }
       System.out.println(max);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        if(max==arr[i]) li.add(i+1);
       }
       return li;
        
    }
}