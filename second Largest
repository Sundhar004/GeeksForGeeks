class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int i=arr.length-2;
        while(i>=0)
        {
           if(arr[i] != arr[i+1])
           {
               return arr[i];
           }
           i--;
        }
        return -1;
    }
}
