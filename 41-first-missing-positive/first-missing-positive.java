class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                if(nums[i]==n)
                {
                    n++;
                }
                else if(n<nums[i])
                {
                    break;
                }
            }
        }
        return n;
    }
}