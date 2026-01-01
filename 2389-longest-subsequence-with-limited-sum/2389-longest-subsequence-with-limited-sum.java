class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        // int[] prefix=new int[nums.length];
        // prefix[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     prefix[i]=prefix[i-1]+nums[i];
        // }
        int[] arr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int ele=queries[i];
            int x=0,sum=0,j=0;
            while(j<nums.length && sum<ele){
                sum+=nums[j];
                //System.out.println(sum);
                j++;
                x++;
            }
            arr[i]=(sum<=ele)?x:x-1;
        }
        return arr;
    }
}