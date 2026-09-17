class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int end = nums.length-1;
        for(int i = 0;i<= end;i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;

    }
    
}