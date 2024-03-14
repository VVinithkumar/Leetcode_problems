class Solution {
    public int[] asteroidCollision(int[] arr) { 
         Stack<Integer>st=new Stack<>();
        for(int x:arr)
        {
            if(x>0)
                st.push(x);
            else  // m=negative
            {
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(x))
                    st.pop();
                if(st.isEmpty() || st.peek()<0)
                    st.push(x);
                else if(st.peek()+x==0) st.pop();
            }
        }
        int []ans=new int[st.size()];
        int ptr=ans.length-1;
        while(st.size()>0)
        {
            ans[ptr--]=st.pop();
        }
        return ans;
        // return st.stream().mapToInt(i->i).toArray();

    }
}