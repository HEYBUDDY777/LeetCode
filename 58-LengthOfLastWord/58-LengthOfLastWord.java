// Last updated: 8/14/2026, 10:53:38 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String result = arr[arr.length-1];
        int n = result.length();
        return n;
    }
}