class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i +1]){
                ans[0] = nums[i];
                break;
            }
        }
        if(nums[0] != 1){
            ans[1] = 1;
        }else{
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i + 1] != nums[i] + 1 &&
                nums[i + 1] != nums[i]) {

                    ans[1] = nums[i] + 1;
                    break;
                }
            }
        }

        if(ans[1] == 0){
            ans[1] = nums.length;
        }
        return ans;
        
    }
}