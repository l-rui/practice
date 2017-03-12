package practice.algorithm;

/**
 * Created by root on 2017/3/12.
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * 编写一个函数来删除单链表中的一个节点（除了尾部），只提供对该节点的引用。
 * 思路：
 * 1、首先判断是否是尾部节点，是则直接返回；
 * 2、将该节点的val值设置为下一个节点的val值；
 * 3、将该节点的next设置为下一个节点的next；
 */
public class DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        if (node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}