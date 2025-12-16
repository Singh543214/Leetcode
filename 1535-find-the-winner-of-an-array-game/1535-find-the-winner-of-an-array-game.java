class Solution {
    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public int getWinner(int[] arr, int k) {
        List<Integer> li=new ArrayList<>();
        if(k>=arr.length) return max(arr);
        int res=(arr[0]>arr[1])?arr[0]:arr[1];
        int count=0;
        int ele=0;
        for (int x : arr) {
               li.add(x);
             }
        while(count<k){
           // System.out.println(li);
            if(li.get(0)>li.get(1)){
                ele=li.get(1);
                li.remove(1);
                li.add(ele);
                if(res==li.get(0)) count++;
                else{
                    res=li.get(0);
                    count=1;
                }
            }else{
                ele=li.get(0);
                li.remove(0);
                li.add(ele);
                if(res==li.get(0)) count++;
                else{
                    res=li.get(0);
                    count=1;
                } 
            }
        }
        return li.get(0);   
    }
}