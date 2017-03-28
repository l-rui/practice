package practice.algorithm;

/**
 * Created by l-rui on 2017/3/28.
 * Given a sorted linked list,delete all nodes that have duplicate numbers,leaving only distinct numbers from the original list.
 * 给定一个排序的链接列表，删除所有具有重复数字的节点，从原始列表中只留下不同的数字。
 */
public class RemoveDuplicatesII {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = new ListNode(0);
        t.next = head;

        ListNode p = t;
        while(p.next!=null&&p.next.next!=null){
            if(p.next.val == p.next.next.val){
                int dup = p.next.val;
                while(p.next!=null&&p.next.val==dup){
                    p.next = p.next.next;
                }
            }else{
                p=p.next;
            }

        }
        return t.next;
    }

}
