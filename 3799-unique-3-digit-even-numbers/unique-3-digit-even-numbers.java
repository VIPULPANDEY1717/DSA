class Solution {
    Set<Integer> set = new HashSet<>();

    public int totalNumbers(int[] digits) {
        set.clear();
        boolean[] used = new boolean[digits.length];

        solve(digits, used, 0, 0);

        return set.size();
    }

    void solve(int[] digits, boolean[] used, int num, int count) {

        if (count == 3) {
            if (num % 2 == 0) {
                set.add(num);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (used[i]) continue;
            if (count == 0 && digits[i] == 0) continue;

            used[i] = true;

            solve(digits, used, num * 10 + digits[i], count + 1);

            used[i] = false;
        }
    }
}