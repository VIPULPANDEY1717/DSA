class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) {
            return n;
        }
        int ans = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int count = 2;
                for (int k = j + 1; k < n; k++) {
                    if ((points[j][1] - points[i][1]) * (points[k][0] - points[i][0])==(points[k][1] - points[i][1]) * (points[j][0] - points[i][0])) {
                        count++;
                    }
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}