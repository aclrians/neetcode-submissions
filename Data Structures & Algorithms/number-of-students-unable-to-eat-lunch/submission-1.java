class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Number of sandwiches in the caf is equal to number of students 
        // Students queue
        // sandwhich stack
        
        int consecNoOrder = 0;

        Queue <Integer> studentLine = new LinkedList<>();
        for (int i = 0; i < students.length; i++){
            studentLine.offer(students[i]);
        }

        Stack <Integer> sandoInv = new Stack<>();
        for(int j = sandwiches.length - 1; j >= 0; j--){
            sandoInv.push(sandwiches[j]);
        }


        while(consecNoOrder < studentLine.size()){
            int frontOfLine = studentLine.peek();
            int topOfStack = sandoInv.peek();
            
            // Student does not prefer top of sando
            if(frontOfLine != topOfStack ){
                studentLine.offer(studentLine.poll());
                consecNoOrder++;
            }
            else{
                studentLine.poll();
                sandoInv.pop();
                consecNoOrder = 0;
            }

        }

        return studentLine.size();
        
    }
}