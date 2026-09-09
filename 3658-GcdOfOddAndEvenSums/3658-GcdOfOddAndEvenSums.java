// Last updated: 9/9/2026, 12:04:41 PM
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