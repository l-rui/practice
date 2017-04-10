package practice.algorithm;

/**
 * Created by l-rui on 2017/4/6.
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 将链接列表从位置m反转到n。 在原位进行循环一次。
 */
public class ReverseLinkedListII {

    public ListNode reverseList(ListNode head, int m, int n) {
        if(head==null || head.next==null) {
            return head;
        }
        if (m == n) {
            return head;
        }
        int i = 1;
        // 当前节点
        ListNode cur = head;
        ListNode before = null;
        // 找出开始节点
        while (m > 1 && i < m) {
            before = cur;
            cur = cur.next;
            i++;
        }
        ListNode start = cur;
        // 当前节点的前一个节点，初始为null
        ListNode pre;
        // 当前节点的后一个节点
        ListNode nxt = cur.next;
        // 在翻转之前，首先将第一个节点的next值设置为null，否则将形成环状链表
        cur.next = null;
        while (nxt != null && i < n) {
            // 首先将后一个nxt节点移动到pre
            pre = nxt;
            // 将后nxt节点索引再往后移动一位
            nxt = nxt.next;
            // 将pre的next索引设置为cur
            pre.next = cur;
            if (null != before) {
                // 将m个节点之前的节点连接到翻转后的节点上
                before.next = pre;
            }
            // 完成后将cur索引前移一位
            cur = pre;
            i++;
            if (i == n) {
                // 最后将n之后的节点连接到翻转完成的链表上
                start.next = nxt;
            }
        }
        // 判断如果是从第一个元素开始翻转的话，直接返回cur否则必须返回head
        return m == 1 ? cur : head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ReverseLinkedListII rll = new ReverseLinkedListII();
        ListNode l = rll.reverseList(head, 1,4);
        ListNode temp = l;
        while (null != temp) {
            System.out.print(temp.val);
            temp = temp.next;
        }

    }

}
