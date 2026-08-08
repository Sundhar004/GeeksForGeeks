class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int subsets = (1<<nums.length);
        List<List<Integer>> ans = new ArrayList<>();
        for(int n=0;n<subsets;n++)
        {
            List<Integer>list = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                if((n&(1<<i)) != 0) list.add(nums[i]);
            }
            ans.add(list);
        }
        return ans;
    }
}