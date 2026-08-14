// Last updated: 8/14/2026, 11:07:26 AM
class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int temp = 0;
        if(x<0)
        return false;
        else{
            while(x!=0)
            {
                temp = (temp*10)+x%10;
                x = x/10;
            }
            if(temp==y) return true;
        }
        return false;
    }
}