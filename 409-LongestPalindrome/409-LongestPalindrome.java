// Last updated: 8/14/2026, 10:50:23 AM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length = 0;
        boolean odd = false;

        for(int count:map.values())
        {
            if(count%2==0)
            {
                length += count;
            }
            else{
                length += count-1;
                odd = true;
            }
        }
        if(odd)
        {
            length++;
        }
        return length;
    }
}