class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean incr = true;
        boolean decre = true;

        for(int i=0;i<n-1;i++){
            if(nums[i] < nums[i+1]){
                decre = false;
            }
        }

        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                incr = false;
            }
        }

        if(incr == true || decre == true){
            return true;
        }
        else{
            return false;
        }
    }
}