class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,0);
        return result;

        
    }
    public void backtrack(List<List<Integer>> ans , List<Integer> temp , int[] nums,int start){
        ans.add(new ArrayList<>(temp));
        for(int i = start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}