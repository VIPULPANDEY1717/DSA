class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = max(weights);
        int right = sum(weights);
        while(left <= right){
            int mid = left + (right - left)/2;
            int numberOfDays = findDays(weights,mid);
            if(numberOfDays <= days){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
        
    }
    int findDays(int[] weights , int cap){
        int days = 1; int load = 0;
        for(int i = 0; i<weights.length;i++){
            if(weights[i] + load > cap){
                days +=1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;
    }
    int max(int[] arr){
        int a = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > a){
                a = arr[i];
            }
        }
        return a;
    }
    int sum(int [] arr){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }
}