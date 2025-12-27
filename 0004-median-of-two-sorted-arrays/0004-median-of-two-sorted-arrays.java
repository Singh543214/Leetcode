class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count=-1;
        boolean odd=true;
        int total=(nums1.length+nums2.length);
        if(total%2==0)  odd=false;
        total=total/2;
        //System.out.println(total);
        int x=10000000,y=10000000;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                count++;
                if(count==total-1) x=nums1[i];
                if(count==total) y=nums1[i];
                i++;
            }
            else{
                count++;
                if(count==total-1) x=nums2[j];
                if(count==total) y=nums2[j];
                j++;
            }
            if(x!=10000000 && y!=10000000) break;
        }
        while(i<nums1.length){
            count++;
                if(count==total-1) x=nums1[i];
                if(count==total) y=nums1[i];
                i++;
                if(x!=10000000 && y!=10000000) break;
        }
        while(j<nums2.length){
                count++;
                if(count==total-1) x=nums2[j];
                if(count==total) y=nums2[j];
                j++;
                if(x!=10000000 && y!=10000000) break;
        }

        return (odd)?(double)y:(double)(x+y)/(double)2;

    }
}