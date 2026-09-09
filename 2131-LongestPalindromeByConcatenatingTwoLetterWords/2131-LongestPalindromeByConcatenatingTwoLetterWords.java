// Last updated: 9/9/2026, 12:05:22 PM
import java.util.HashMap;

class Solution {
    public int longestPalindrome(String[] words) {

        HashMap<String, Integer> map = new HashMap<>();
        int length = 0;

        for (String word : words) {

            String reverse = "" + word.charAt(1) + word.charAt(0);

            if (map.getOrDefault(reverse, 0) > 0) {

                length += 4;
                map.put(reverse, map.get(reverse) - 1);

            } else {

                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (String key : map.keySet()) {

            if (key.charAt(0) == key.charAt(1) && map.get(key) > 0) {
                length += 2;
                break;
            }
        }

        return length;
    }
}