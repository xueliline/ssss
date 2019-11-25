import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list1 = new ArrayList();
        List<ListNode> list2 = new ArrayList<>();
        ListNode res = new ListNode(-1);
        ListNode pre = res;
        ListNode cur1 = null;
        ListNode cur2 = null;
        for (int k = 0; k < lists.length; k++) {
            pre=res;
            cur1 = res.next;
            cur2 = lists[k];
            while (cur1 != null) {
                list1.add(cur1);
                cur1 = cur1.next;
            }
            while (cur2 != null) {
                list2.add(cur2);
                cur2 = cur2.next;
            }
            int i = 0;
            int j = 0;
            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i).val > list2.get(j).val) {
                    pre.next = list2.get(j);
                    j++;
                    pre = pre.next;
                } else {
                    pre.next = list1.get(i);
                    i++;
                    pre = pre.next;
                }

            }
            while (i < list1.size()) {
                pre.next = list1.get(i);
                i++;
                pre = pre.next;
            }
            while (j < list2.size()) {
                pre.next = list2.get(j);
                j++;
                pre = pre.next;
            }
            list1.clear();
            list2.clear();
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode[] lists=new ListNode[3];
        ListNode l11=new ListNode(1);
        ListNode l12=new ListNode(4);
        ListNode l13=new ListNode(5);
        l11.next=l12;
        l12.next=l13;
        ListNode l21=new ListNode(1);
        ListNode l22=new ListNode(3);
        ListNode l23=new ListNode(4);
        l21.next=l22;
        l22.next=l23;
        ListNode l31=new ListNode(2);
        ListNode l32=new ListNode(6);
        l31.next=l32;
        Solution23 solution23=new Solution23();
        lists[0]=l11;
        lists[1]=l21;
        lists[2]=l31;
        solution23.mergeKLists(lists);
    }
}
