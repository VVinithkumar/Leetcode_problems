class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int nums3[]=new int[n1+n2];
        System.arraycopy(nums1,0,nums3,0,n1);
        System.arraycopy(nums2,0,nums3,n1,n2);
        int n=nums3.length;
        Arrays.sort(nums3);
        double m=0;	
        if(n%2==1)
        {
            m=nums3[((n+1)/2)-1];
        }
        else
        {
            m=(nums3[n/2-1]+nums3[n/2])/2.0;
        }
        return m;
    }
}