class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] a = num1.split("\\+|i");
        String[] b = num2.split("\\+|i");

        int r1 = Integer.parseInt(a[0]);
        int i1 = Integer.parseInt(a[1]);
        int r2 = Integer.parseInt(b[0]);
        int i2 = Integer.parseInt(b[1]);

        int real = r1 * r2 - i1 * i2;
        int imag = r1 * i2 + i1 * r2;

        return real + "+" + imag + "i";
    }
}