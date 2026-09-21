class Solution {
    public boolean isHappy(int n) {
        
        int val = n;
        while(val >= 10) {
            int temp = val;
            int sum = 0;
            while(temp != 0) {
                sum += (temp%10)*(temp%10);
                temp = temp/10;
            }
            val = sum;
        }
        return val == 1 || val==7;
    }
}