class Solution {
    static void add(Set<Character> set){
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
    }
    public int maxVowels(String s, int k) {
        int count=0,n_v=0,max=0;
        Set<Character> set=new HashSet<>();
        add(set);
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))) n_v++;
        }
        max=Math.max(max,n_v);
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i-k))) n_v--;
            if(set.contains(s.charAt(i))) n_v++;
            max=Math.max(max,n_v);
        }
        return max;
    }
}