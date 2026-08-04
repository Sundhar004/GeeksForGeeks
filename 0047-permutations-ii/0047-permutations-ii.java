class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean used[] = new boolean[nums.length];
        permutation(nums,new ArrayList<>(),used);
        return ans;
    }
    public void permutation(int nums[],List<Integer>curr,boolean used[])
    {
        if(curr.size() == nums.length)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            curr.add(nums[i]);
            permutation(nums,curr,used);
            curr.remove(curr.size()-1);
            used[i] = false;
        }
    }
}