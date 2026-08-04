class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        subset(0, nums, new ArrayList<>(),ansList);
        return ansList;
    }

    public void subset(int ind, int nums[], List<Integer> curr,List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(curr));
        for(int i=ind;i<nums.length;i++)
        {
            if(i != ind  && nums[i] == nums[i-1]) 
            {
                continue;
            }
            curr.add(nums[i]); //take
            subset(i + 1, nums, curr,ansList);
            curr.remove(curr.size() - 1); //not take
        }
    }
}