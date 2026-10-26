class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0); dummy.next=head; ListNode groupPrev=dummy;
        while (true) {
            ListNode kth=groupPrev;
            for (int i=0;i<k && kth!=null;i++) kth=kth.next;
            if (kth==null) break;
            ListNode groupNext=kth.next, prev=groupNext, cur=groupPrev.next;
            while (cur!=groupNext) { ListNode next=cur.next; cur.next=prev; prev=cur; cur=next; }
            ListNode oldStart=groupPrev.next;
            groupPrev.next=kth; groupPrev=oldStart;
        }
        return dummy.next;
    }
}
