class Solution {
    public int[] circularGameLosers(int n, int k) {
        HashSet<Integer> set =new HashSet<>();
        set.add(1);
        int i=0,j=1;
        while(true){
            i=((i+(j*k))%n);
            if(!set.contains(i+1)) set.add(i+1);
            else break;
            j++;
        }
        List<Integer> li=new ArrayList<>();
        for(j=1;j<=n;j++){
            if(!set.contains(j)) li.add(j);
        }
        return li.stream().mapToInt(Integer::intValue).toArray();


    }
}