// Last updated: 8/14/2026, 11:07:28 AM
class Solution {
    public int reverse(int x) {
        int num = x;
        int temp = 0;

        if(num<0)
        {
            num = num*-1;
        }
        while(num!=0)
        {
            if (temp > Integer.MAX_VALUE / 10 ||
                temp < Integer.MIN_VALUE / 10) {
                return 0;
            }
            temp = (temp*10)+(num%10);
            num = num/10;
        }
        if(x>0)
        return temp;
        else
        return temp*-1;
    }
}