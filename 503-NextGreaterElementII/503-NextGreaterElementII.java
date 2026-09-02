// Last updated: 9/2/2026, 11:40:43 AM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3       int n=nums.length;
4       int[] arr=new int[n];
5       Arrays.fill(arr,-1);
6       Stack<Integer> stack=new Stack<>();
7
8       for(int i=2*n-1;i>=0;i--){
9          int num=nums[i%n];
10          while(!stack.isEmpty() && stack.peek()<=num){
11            stack.pop();
12          }
13          if(i<n && !stack.isEmpty()){
14             arr[i]=stack.peek();
15          }
16          stack.push(num);
17       }
18
19       return arr;
20
21    }
22}