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
        // 当前节点的前一个节点，初始为null
        ListNode pre;
        // 当前节点
        ListNode cur = head;
        // 当前节点的后一个节点
        ListNode nxt = head.next;
        // 在翻转之前，首先将第一个节点的next值设置为null，否则将形成环状链表
        cur.next = null;
        while (nxt != null) {
            // 首先将后一个nxt节点移动到pre
            pre = nxt;
            // 将后nxt节点索引再往后移动一位
            nxt = nxt.next;
            // 将pre的next索引设置为cur
            pre.next = cur;
            // 完成后将cur索引前移一位
            cur = pre;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode l = rll.reverseList(head);
        ListNode temp = l;
        while (null != temp) {
            System.out.print(temp.val);
            temp = temp.next;
        }

    }

}
