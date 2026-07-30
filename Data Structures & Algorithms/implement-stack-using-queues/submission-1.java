class MyStack {
    
    Queue<Integer> q = new LinkedList<>();
    int prev = 0;

    public MyStack() {
        
    }
    
    public void push(int x) { 
        q.offer(x);
    }
    
    public int pop() {
        int popValue = 0;
        for(int i = 0; i < q.size()-1; i++){
            prev = q.peek();
            q.poll();
            q.offer(prev);
        }

        return q.poll();

        
    }
    
    public int top() {
        int peekValue = 0;
        for(int i = 0; i < q.size(); i++){
            if(i == q.size()-1){
                peekValue = q.peek();
            }
            prev = q.peek();
            q.poll();
            q.offer(prev);
        }

        return peekValue;
        
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