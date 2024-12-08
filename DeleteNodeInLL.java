import java.lang.classfile.components.ClassPrinter.ListNode;

public class DeleteNodeInLL {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null)
           return null;
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next==null)
           slow=null;
        slow.val=slow.next.val;
        slow.next=slow.next.next;
return head;
    }
}

