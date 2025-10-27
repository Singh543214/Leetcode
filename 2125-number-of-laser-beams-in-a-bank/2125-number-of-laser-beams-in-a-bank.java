class Solution {
    static int count_(String s){
        int count =0;
        for(char ch: s.toCharArray()){
            if(ch=='1') count++;
        }
        return count;
    }
    static int found(List<Integer> li){
        int curr=0;
        for(int i=0;i<li.size()-1;i++){
            curr+=li.get(i)*li.get(i+1);
        }
        return curr;
        
    }
    public int numberOfBeams(String[] bank) {
        List<Integer> li=new ArrayList<>();
      for(int i=0;i<bank.length;i++){
        int x=count_(bank[i]);
        if(x!=0) li.add(x);
       
      }
       System.out.print(li);
     return found(li);

    }
}