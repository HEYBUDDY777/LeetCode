// Last updated: 8/14/2026, 10:50:20 AM
class Solution {
    public int thirdMax(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i:nums)
        // {
        //     set.add(i);
        // }
        // int n = set.size();
        // int[] result = new int[n];
        // int k = 0;
        // for(int i:set)
        // {
        //     result[k++]=i;
        // }
        // Arrays.sort(result);
        // int op = 0;
        // int n1 = result.length;
        // if(n1<3)
        // {
        //     op = result[n1-1];
        // }
        // else{
        //     op = result[n1-3];
        // }
        // return op;

        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

        for(int i:nums)
        {
            if(i==a||i==b||i==c){
                continue;
            }
            if(i>a)
            {
                c = b;
                b = a;
                a = i;
            }
            else if(i>b)
            {
                c = b;
                b = i;
            }
            else if(i>c)
            {
                c = i;
            }
        }
        if(c==Long.MIN_VALUE)
        {
            return (int) a;
        }
        return (int) c;
    }
}