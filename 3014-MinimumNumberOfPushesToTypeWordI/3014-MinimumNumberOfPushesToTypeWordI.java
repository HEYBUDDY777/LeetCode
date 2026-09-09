// Last updated: 9/9/2026, 12:04:59 PM
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