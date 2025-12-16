class Solution {
    static boolean check(String s){
        return s.charAt(s.length()-1)=='0';
    }
    public int numSteps(String s) {
        if(s.length()==1) return 0;
        int count=0;
        while(s.length()!=1){
            StringBuilder sb=new StringBuilder(s);
            if(check(s)){
                for(int i=s.length()-1;i>0;i--){
                    sb.setCharAt(i,sb.charAt(i-1));
                }
                sb.setCharAt(0,'0');
                s=sb.toString().substring(1);
            }
            else{
                sb = new StringBuilder(s);
                int i=s.length()-1;
              for(;i>=0;i--){
                if(s.charAt(i)=='1') sb.setCharAt(i,'0');
                else{
                    sb.setCharAt(i,'1');
                    break;
                }
              }
              s=sb.toString();
              if(i==-1) s="1"+s;
            }
            //System.out.println(s);
            count++;
        }
        return count;
    }
}