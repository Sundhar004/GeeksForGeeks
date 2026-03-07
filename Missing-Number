class Solution {
    int missingNum(int arr[]) {
        int n = arr.length+1;
        long tot = (long)n*(n+1)/2;
        long actual=0;
        for(int i:arr)
        {
            actual = actual+i;
        }
        return (int)tot-(int)actual;
    }
}
