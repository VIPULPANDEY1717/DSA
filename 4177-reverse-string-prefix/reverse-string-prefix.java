class Solution {
   public String reversePrefix(String s, int k) {
    String a = s.substring(0, k);
    String b = s.substring(k);

    StringBuilder rev = new StringBuilder();

    for (int i = a.length() - 1; i >= 0; i--) {
        rev.append(a.charAt(i));
    }

    return rev.toString() + b;
}
}