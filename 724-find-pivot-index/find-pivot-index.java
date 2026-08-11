class Solution {
    public int pivotIndex(int[] nums) {
        int total = totalSum(nums,0);
        return findPivot(nums,0,total,0);
        
        
    }
    public int totalSum(int[] arr , int index){
        if(index == arr.length){
            return 0;
        }
        return arr[index] + totalSum(arr,index+1);
    }

    int findPivot(int[] arr , int leftSum,int total,int index){
        if(index == arr.length){
            return -1;
        }
        int rightSum = total - leftSum - arr[index];
        if(rightSum == leftSum){
            return index;
        }
        return findPivot(arr,leftSum+arr[index],total,index+1);
    }
}