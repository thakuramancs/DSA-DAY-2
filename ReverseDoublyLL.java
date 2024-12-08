class ReverseDoublyLL {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode curr=head;
        DLLNode prev=null;
        while(curr!=null)
        {
            DLLNode nxt=curr.next;
            curr.prev=nxt;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}