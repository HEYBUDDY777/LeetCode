// Last updated: 9/2/2026, 11:25:41 AM
1class Solution {
2    public int earliestFullBloom(int[] plantTime, int[] growTime) {
3        int n  = plantTime.length;
4        int arr[][] = new int[n][2];
5        for(int i=0;i<n;i++){
6            arr[i][0] = growTime[i];
7            arr[i][1] = plantTime[i];
8        }
9        Arrays.sort(arr,(a,b)->(b[0]-a[0]));
10        int time=0;
11        int max=0;
12        for(int i=0;i<n;i++){
13            time += arr[i][1];
14            max = Math.max(max,time+arr[i][0]);
15        }
16        return max;
17    }
18}