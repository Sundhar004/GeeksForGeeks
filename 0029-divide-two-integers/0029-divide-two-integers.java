class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign = true;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        else if(dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        else if(dividend == Integer.MAX_VALUE && divisor == 1) return Integer.MAX_VALUE;
        if(divisor == dividend) return 1;
        if(dividend >= 0 && divisor<0) sign = false;
        else if(divisor>0 && dividend<=0) sign = false;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        int ans = 0;
        while(n>=d)
        {
            int count = 0;
            while(n>=(d<<(count+1)))
            {
                count++;
            }
            ans=ans+(1<<count);
            n=n-(d<<count);
        }
        if(ans == (1<<31) && sign == true) return Integer.MAX_VALUE;
        if(ans == (1<<31) && sign == false) return Integer.MIN_VALUE;
        return sign? ans: -ans;
    }
}