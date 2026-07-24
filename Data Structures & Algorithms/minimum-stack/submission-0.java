class MinStack {
    
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
        
    }
    
    public void push(int val) {
        s.push(val);
        if(min.empty()){
            min.push(val);
        } else if(min.peek() <= val){
            min.push(min.peek());
        }else{
            min.push(val);
        }
        
    }
    
    public void pop() {
        s.pop();
        min.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
