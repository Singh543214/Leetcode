class Solution {
    static void add(HashMap<Character,String> map){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    static List<String> convert(char a,List<String> b,HashMap<Character,String> map){
        String s1=map.get(a);
        List<String> li=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<b.size();j++){
                String str=String.valueOf(s1.charAt(i))+b.get(j);
                 li.add(str);
            }
        }
        return li;
    }

    public List<String> letterCombinations(String digits) {
       HashMap<Character,String> map=new HashMap<>();
       add(map);
       List<String> str=new ArrayList<>();
       String s=map.get(digits.charAt(digits.length()-1));
        for(int i=0;i<s.length();i++){
            str.add(String.valueOf(s.charAt(i)));
        }
       if(digits.length()==1) return str;
       System.out.println(convert('2',str,map));
      for(int i=digits.length()-2;i>=0;i--){
        str=convert(digits.charAt(i),str,map);
      }

       return str;
    }
}