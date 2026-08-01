class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) return new int[]{};
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 2;
        map.put(temp[0],1);
        for(int i=1;i<temp.length;i++)
        {
            if(!map.containsKey(temp[i])) 
            {
                map.put(temp[i],rank);
                rank++;
            }
        }
        int in = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}