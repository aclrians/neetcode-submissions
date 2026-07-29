class BrowserHistory {

    public class ListNode {
        String page;
        ListNode next;
        ListNode prev;

        public ListNode(String page){
            this.page = page;
            this.next = null;
            this.prev = null;

        }
    }

    ListNode current;

    public BrowserHistory(String homepage) {

        current = new ListNode(homepage);

        
    }
    
    public void visit(String url) {
        ListNode visitLink = new ListNode(url);

        visitLink.prev = current;
        current.next = visitLink;
        current = visitLink;


    }
    
    public String back(int steps) {
        for(int i = 0; i < steps; i++){
            if(current.prev == null){
                break;
            }
            current = current.prev;
        }
        
        return current.page;
        
    }
    
    public String forward(int steps) {
        for(int i = 0; i < steps; i++){
            if(current.next == null){
                break;
            }
            current = current.next;
        }

        return current.page;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */