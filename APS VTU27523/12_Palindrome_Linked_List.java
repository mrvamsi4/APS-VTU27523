class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        while (fast != null && fast.next != null) { slow=slow.next; fast=fast.next.next; }
        ListNode prev=null, cur=slow;
        while (cur != null) { ListNode next=cur.next; cur.next=prev; prev=cur; cur=next; }
        ListNode a=head, b=prev;
        while (b != null) { if (a.val != b.val) return false; a=a.next; b=b.next; }
        return true;
    }
}
