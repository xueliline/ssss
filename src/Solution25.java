import java.util.ArrayList;
import java.util.List;

public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prehead = new ListNode(-1);
        ListNode cur = head;
        ListNode pre = prehead;
        ListNode next;
        ListNode first = null;
        prehead.next = head;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }

        for (int i = 0; i < len / k; i++) {
            int j = 0;

            while (j < k) {
                if (i == 0 && j == 0) {
                    pre.next = cur;
                    next = cur.next;
                    cur.next = next;
                } else {
                    first = pre.next;
                    pre.next = cur;
                    next = cur.next;
                    cur.next = first;
                }
                cur = next;
                j++;
            }
            pre = first;
        }
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Solution25 solution25 = new Solution25();
        solution25.reverseKGroup(l1, 3);


    }
}