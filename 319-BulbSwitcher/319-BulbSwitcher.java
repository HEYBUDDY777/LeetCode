// Last updated: 8/14/2026, 10:50:46 AM
class Solution {
    public int bulbSwitch(int n) {
        // boolean[] arr = new boolean[n+1];
        // int c = 0;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=i;j<=n;j+=i)
        //     {
        //         arr[j] = !arr[j];
        //     }
        // }
        // for(int i=1;i<=n;i++)
        // {
        //     if(arr[i]==true) c++;
        // }
        // return c;
        int c = (int)Math.sqrt(n);
        return c;
    }
}