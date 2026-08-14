// Last updated: 8/14/2026, 10:48:03 AM
class Solution {
    public boolean vowels(char ch)
    {
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public int maxVowels(String s, int k) {
        int ws = 0;
        int max = 0;
        int c = 0;
        for(int we=0;we<s.length();we++)
        {
            if(vowels(s.charAt(we)))
            {
                c++;
            }
            if(we>=k-1)
            {
                max = Math.max(c,max);
                if(vowels(s.charAt(ws)))
                {
                    c--;
                }
                ws++;
            }
            
        }
        return max;
    }
}