// Last updated: 8/14/2026, 10:50:31 AM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(char b: s.toCharArray())
        {
            freq[b-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            return i;
        }
        return -1;
    }
}