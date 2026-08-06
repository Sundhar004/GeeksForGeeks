class Solution {
    public int smallestNumber(int n, int t) {
        int res = isDiv(n,t);
        while(res == -1)
        {
            n++;
            res = isDiv(n,t);
        }
        return res;
    }
    public static int isDiv(int n,int t)
    {
        int og = n;
        int prod = 1;
        while(n > 0)
        {
            int mod = n%10;
            prod = prod*mod;
            n = n/10;
        }
        if(prod % t == 0)
        {
            return og;
        }
        return -1;
    } 
}