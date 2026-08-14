// Last updated: 8/14/2026, 10:47:29 AM
class Solution {
    public int minimumPushes(String word) {
        int push = 0;
        for(int i=0;i<word.length();i++)
        {
            push += (i/8)+1;
        }
        return push;
    }
}