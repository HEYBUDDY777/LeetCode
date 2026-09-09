// Last updated: 9/9/2026, 12:05:59 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        int[] result = new int[gain.length+1];
        for(int i=0;i<gain.length;i++)
        {
            sum = sum+gain[i];
            result[i] = sum;
            if(result[i]>max)
            {
                max=result[i];
            }
        }
        return max;

    }
}