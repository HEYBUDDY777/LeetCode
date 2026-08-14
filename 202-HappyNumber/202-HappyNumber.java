// Last updated: 8/14/2026, 10:51:45 AM
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)) {
            set.add(n);

            int temp = 0;

            while(n > 0) {
                int digit = n % 10;
                temp += digit * digit;
                n = n / 10;
            }

            n = temp;
        }

        return n == 1;
    }
}