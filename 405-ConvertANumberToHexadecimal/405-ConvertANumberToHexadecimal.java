// Last updated: 8/14/2026, 10:50:27 AM
class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0) {

            int digit = num & 15; // last 4 bits
            sb.append(hex[digit]);

            num >>>= 4; // unsigned right shift
        }

        return sb.reverse().toString();
    }
}