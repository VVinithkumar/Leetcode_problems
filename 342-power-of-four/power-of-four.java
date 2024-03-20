class Solution {
    public boolean isPowerOfFour(int n) {
        //  if(n<=0){
        //     return false;
        // }
        // while(n%4 == 0) {
        //     n/=4;
        // }
        // return n==1;
          if(n==1)
        {
            return true;
        }
        if(n==0 && n<0)
        {
            return false;
        }
        if(n==2147483647)
        {
            return false;
        }
        int v=15;
        for(int i=1;i<=v;i++)
        {
            double m=Math.pow(4,i);
            if((int)m==n)
            {
                return true;
            }
           
        }
        return false;
    }
}