class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(nums,0,ans,new ArrayList<>());
        return ans;
        
    }
    public void backtracking(int[] nums,int start,List<List<Integer>> ans,List<Integer> curr){
         ans.add(new ArrayList<>(curr));
        for(int i = start;i < nums.length;i++){
           if(i>start && nums[i] == nums[i-1] ){
            continue;
           }
            curr.add(nums[i]);
            backtracking(nums,i+1,ans,curr);
            curr.remove(curr.size()-1);

        }
    }
}