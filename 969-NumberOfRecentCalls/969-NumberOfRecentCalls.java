// Last updated: 8/14/2026, 10:49:01 AM
class RecentCounter {
    public Queue<Integer>requests;
    public RecentCounter() {
        this.requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        requests.add(t);
        while(!requests.isEmpty()&&requests.peek()<t-3000)
        {
            requests.poll();
        }
        return requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */