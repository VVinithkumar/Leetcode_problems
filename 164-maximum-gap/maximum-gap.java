class Solution {
    public int maximumGap(int[] nums) {
        List<Integer> al=new ArrayList<>();
        if(nums.length==1)
        {
            return 0;
        }
        if(nums.length==2)
        {
            return nums[1]-nums[0];
        }
        Arrays.sort(nums);
        int ans=0;
        int temp=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans=Math.abs(temp-nums[i]);
            al.add(ans);
            temp=nums[i];
        }
      Collections.sort(al);
        return al.get(al.size()-1);
    }
}