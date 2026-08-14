// Last updated: 8/14/2026, 10:51:20 AM
class MyStack {
    Queue<Integer>q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
       
		    q.offer(x);
		    for(int j=1;j<q.size();j++)
		    {
		        q.offer(q.poll());
		    }
		
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */