package practice.algorithm;

/**
 * Created by l-rui on 2017/4/6.
 * Reverse a singly linked list.
 * 反转单链接列表。
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode pre = head;
        ListNode p = head.next;
        pre.next = null;
        ListNode nxt;
        while(p!=null) {
            nxt = p.next;
            p.next = pre;
            pre = p;
            p = nxt;
        }
        return pre;
    }

}
