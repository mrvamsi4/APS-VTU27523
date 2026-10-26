public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;
        do {
            if (fast==null || fast.next==null) return null;
            slow=slow.next; fast=fast.next.next;
        } while (slow!=fast);
        slow=head;
        while (slow!=fast) { slow=slow.next; fast=fast.next; }
        return slow;
    }
}
