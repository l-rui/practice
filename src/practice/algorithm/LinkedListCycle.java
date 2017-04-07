package practice.algorithm;

/**
 * Created by l-rui on 2017/4/7.
 * Given a linked list, determine if it has a cycle in it.
 * 给定链表，确定它是否有一个环路。
 * 思路：
 * 创建fast和slow两个ListNode引用，每次循环fast走两步，slow走一步，如果链表存在环路，则fast和slow一定会有相等的时候。
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
