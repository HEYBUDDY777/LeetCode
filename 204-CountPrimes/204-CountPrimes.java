// Last updated: 8/14/2026, 10:51:43 AM
class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2;i*i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j = j+i) {
                    prime[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i])
                cnt++;
        }
        return cnt;
    }
}