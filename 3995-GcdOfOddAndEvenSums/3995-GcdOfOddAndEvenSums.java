// Last updated: 8/14/2026, 10:47:34 AM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int final1 = 0;
        if(n==1)
        {
            return 1;
        }
       for(int i=1;i<n*2;i+=2)
       {
            sumOdd += i;
            sumEven += i+1;
       } 
       for(int i=2;i<=sumOdd/2;i++)
       {
        if(sumOdd%i==0 && sumEven%i==0)
        {
            final1 = i;
        }
       }
       return final1;
    }
}