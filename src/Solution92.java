import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.List;

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        ListNode pre = prehead;
        int count = 0;
        while (head != null) {
            count += 1;
            if (count >= m && count <= n)
                list.add(head);
            if (count > n)
                break;
            if(count==m-1)
            {
                pre = head;
            }

            head = head.next;
        }
        for (int i = list.size() - 1; i > 0; i--) {
            list.get(i).next = list.get(i - 1);
        }
        pre.next = list.get(list.size() - 1);
        list.get(0).next = head;
        return prehead.next;
    }

}



//    public static void main(String[] args) {
//        ListNode l1=new ListNode(1);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(4);
//        ListNode l5=new ListNode(5);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        Solution92 solution92=new Solution92();
//        solution92.reverseBetween(l1,2,4);
//
//    }