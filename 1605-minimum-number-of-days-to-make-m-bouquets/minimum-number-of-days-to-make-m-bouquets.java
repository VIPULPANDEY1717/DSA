class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        while (low < high) {
            int mid = low + (high - low) / 2; 
            if (helper(bloomDay, mid, m, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean helper(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        for (int b : bloomDay) {
            if (b <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;  
            }
        }
        return bouquets >= m;
    }
}