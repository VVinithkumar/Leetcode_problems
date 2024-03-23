class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> al=new ArrayList<>();
        int arr[]=new int[2];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                al.add(grid[i][j]);
            }
        }
        int ans[]=new int[al.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=al.get(i);
        }
         int n=1;
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]>0)
            {
                if(ans[i]==n)
                {
                    n++;
                }
                else if(n<ans[i])
                {
                    break;
                }
            }
        }
        arr[1]=n;
        for(int i=0;i<ans.length;i++)
        {
            for(int j=i+1;j<ans.length;j++)
            {
               if(ans[i]==ans[j])
               {
               arr[0]=ans[j];
               }
            }
        }
        return arr;
    }
}