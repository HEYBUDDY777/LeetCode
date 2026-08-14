// Last updated: 8/14/2026, 10:49:20 AM
class Solution {
    public int repeatedStringMatch(String a, String b) {
        String c = a;
        int d = 1;
        int length = a.length()+b.length();
        while(!c.contains(b))
        {
            if(c.length()>length)
            {
                return -1;
            }
            c = c+a;
            d++;
        }
        return d;
    }
}