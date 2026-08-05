class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        sum(0,nums,target,new ArrayList<>(),ansList);
        return ansList;
    }
    public void sum(int ind, int nums[], int target, List<Integer> curr, List<List<Integer>> ansList)
    {
        if(ind == nums.length)
        {
            if(target == 0)
            {
                ansList.add(new ArrayList<>(curr));
            }
            return;
        }
        if(nums[ind]<=target)
        {
         curr.add(nums[ind]);
         sum(ind,nums,target-nums[ind],curr,ansList);
         curr.remove(curr.size()-1);
        }
        sum(ind+1,nums,target,curr,ansList);
    }
}