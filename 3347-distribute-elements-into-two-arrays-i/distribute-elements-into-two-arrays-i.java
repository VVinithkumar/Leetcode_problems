class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> al=new ArrayList<>();
        List<Integer> al1=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        al.add(nums[0]);
        al1.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(al.get(al.size()-1)>al1.get(al1.size()-1))
            {
                al.add(nums[i]);
            }
            else
            {
                al1.add(nums[i]);
            }
        }
        ans.addAll(al);
        ans.addAll(al1);
        int arr[]=new int[ans.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}