package list;

import common.ListNodeSingle;

public class List0019 {

    public static void main(String[] args) {
        ListNodeSingle node1= new ListNodeSingle();
        node1.val = 1;

        ListNodeSingle node2= new ListNodeSingle();
        node2.val = 2;

        ListNodeSingle node3= new ListNodeSingle();
        node3.val = 3;

        ListNodeSingle node4= new ListNodeSingle();
        node4.val = 4;

        ListNodeSingle node5= new ListNodeSingle();
        node5.val = 5;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNodeSingle nodeSingle = removeNthFromEnd(node1, 5);
        System.out.println(nodeSingle.val);


    }

    public static ListNodeSingle removeNthFromEnd(ListNodeSingle head, int n) {
        ListNodeSingle pre = new ListNodeSingle();
        pre.val = -100;
        pre.next = head;

        int nth = doRemoveNthFromEnd(pre, head, n);
        if (n > nth) {
            return null;
        } else if (n == nth) {
            return pre.next;
        } else {
            return head;
        }
    }

    public static int doRemoveNthFromEnd(ListNodeSingle pre, ListNodeSingle curr, int n) {
        if (curr == null) {
            return 0;
        } else {
            int nth = doRemoveNthFromEnd(curr, curr.next, n) + 1;
            if (nth == n) {
                pre.next = curr.next;
            }
            return nth;
        }
    }
}
