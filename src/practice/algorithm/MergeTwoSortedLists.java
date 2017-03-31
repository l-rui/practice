package practice.algorithm;

/**
 * Created by lirui on 2017/3/31.
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * 合并两个排序的链接列表，并将其作为新列表返回。 新列表应通过将前两个列表的节点拼接在一起。
 * 思路：
 * 新表声明两个表头，一个是fakehead，一个是会挪动的指针，用于拼接。
 * 同时，边界条件在后面的补拼中页解决了，所以开头没必要做边界判断，这样代码简化为：
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakehead = new ListNode(-1);
        ListNode l3 = fakehead;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                l3.next = l1;
                l3 = l3.next;
                l1 = l1.next;
            }else{
                l3.next = l2;
                l3 = l3.next;
                l2 = l2.next;
            }
        }

        if(l1!=null)
            l3.next = l1;
        if(l2!=null)
            l3.next = l2;
        return fakehead.next;
    }

}
