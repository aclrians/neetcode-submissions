class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> s = new Stack<>();

        for(String ops:operations){
            if(ops.equals("C")){
                s.pop();
            }
            else if(ops.equals("D")){
                s.push(2*s.peek());
            }
            else if(ops.equals("+")){
                int top = s.pop(); // Record our top value and get rid of it
                int val = top + s.peek(); // Add our old top value with the value that comes before it
                s.push(top);
                s.push(val);

            } else { 
                s.push(Integer.parseInt(ops));
            }
        }

        int sum = 0;
        while (s.size() > 0) sum += s.pop();

        return sum;
        
    }

}