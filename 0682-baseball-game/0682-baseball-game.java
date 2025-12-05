class Solution {
    public int calPoints(String[] operations) {
      int n=operations.length;  
      int[] arr=new int[n];
      int x=-1;
      for(int i=0;i<n;i++){
        if(operations[i].equals("C")){
           x--;
        }
        else if(operations[i].equals("D")){
            arr[++x]=arr[x-1]*2;
        }
        else if(operations[i].equals("+")){
            arr[++x]=arr[x-1]+arr[x-2];
        }
        else{
           arr[++x]=Integer.parseInt(operations[i]);
        }
      } 
      int sum=0;
      for(int i=0;i<=x;i++){
        sum+=arr[i];
      } 
      return sum;
    }
}