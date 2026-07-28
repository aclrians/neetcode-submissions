class MyLinkedList {

    // The zero value is placeholder
    ListNode dummy = new ListNode(0);
    int size = 0;

    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;            
        }
    }

    public MyLinkedList() {

        
    }
    
    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }

        ListNode current = dummy.next;
        
        for(int i = 0; i < index; i++){
            current = current.next;
        }

        return current.val;
        
    }
    
    public void addAtHead(int val) {

        ListNode newHead = new ListNode(val);
        newHead.next = dummy.next;
        dummy.next = newHead;

        size++;
        
    }
    
    public void addAtTail(int val) {
        ListNode current = dummy.next;

        if(size == 0){
            addAtHead(val);
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        ListNode newTail = new ListNode(val);
        current.next = newTail;

        size++;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode current = dummy.next;        

        // appended to the end of the list
        if(index == size ){
           addAtTail(val);
           return;

        }
        else if(index > size){
            return;
        }
        else if(index == 0 ){
            addAtHead(val);
            return;
        }
        else{
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            ListNode newNode = new ListNode(val);
            // node we want to insert comes after current;
            newNode.next = current.next;
            current.next = newNode;


        }

        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        
        if(index >= size || index < 0){
            return;
        }

        ListNode prev = dummy;
        ListNode current = dummy.next;
    

        if(index == 0){
            dummy.next = dummy.next.next;
            size--;
            return;
        }

        for(int i = 0; i < index; i++){
            prev = current;
            current = current.next;
        }

        prev.next = current.next;

         
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */