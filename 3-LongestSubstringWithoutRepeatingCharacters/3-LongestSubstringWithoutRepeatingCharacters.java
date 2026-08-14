// Last updated: 8/14/2026, 11:07:41 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int ws = 0;
        int max = 0;
        for(int we=0;we<s.length();we++)
        {
            while(set.contains(s.charAt(we)))
            {
                set.remove(s.charAt(ws));
                ws++;
            }
            set.add(s.charAt(we));
            max = Math.max(max,we-ws+1);
        }
        return max;
    }
}