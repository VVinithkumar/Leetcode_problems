class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> al=new HashSet<>();
        Set<Integer> al1=new HashSet<>();
        int arr[]=new int[2];
      for(int i=0;i<nums1.length;i++)
      {
        for(int j=0;j<nums2.length;j++)
        {
            if(nums1[i]==nums2[j])
            {
                al.add(i);
            }
        }
      }
       for(int i=0;i<nums2.length;i++)
      {
        for(int j=0;j<nums1.length;j++)
        {
            if(nums2[i]==nums1[j])
            {
                al1.add(i);
            }
        }
      }
      arr[0]=al.size();
      arr[1]=al1.size();
    return arr;
    }
}