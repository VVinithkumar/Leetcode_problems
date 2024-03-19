class Solution {
    public int maximumGap(int[] nums) {
        List<Integer> al=new ArrayList<>();
        if(nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int ans=0;
        int temp=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans=nums[i]-temp;
            al.add(ans);
            temp=nums[i];
        }
      Collections.sort(al);
        return al.get(al.size()-1);
    }
}