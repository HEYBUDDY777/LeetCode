// Last updated: 9/9/2026, 12:05:20 PM
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n  = plantTime.length;
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = growTime[i];
            arr[i][1] = plantTime[i];
        }
        Arrays.sort(arr,(a,b)->(b[0]-a[0]));
        int time=0;
        int max=0;
        for(int i=0;i<n;i++){
            time += arr[i][1];
            max = Math.max(max,time+arr[i][0]);
        }
        return max;
    }
}