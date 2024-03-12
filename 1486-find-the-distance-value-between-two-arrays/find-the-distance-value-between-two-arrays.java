class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0,f=1;
        for(int i=0;i<arr1.length;i++)
        {
            f=1;
            for(int j=0;j<arr2.length;j++)
            {
                int a=Math.abs(arr1[i]-arr2[j]);
                
                if(a<=d)
                { 
                    f=0;
                    break;
                }
               
            }
            if(f==1){
                c++;
                f=0;
            } 
            
        }
        return c;
    }
}