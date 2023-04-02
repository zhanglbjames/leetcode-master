package list;

import common.ListNodeSingle;

public class List0024 {

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

        ListNodeSingle nodeSingle = swapPairs(node1);
        System.out.println(nodeSingle.val);
    }

    public static ListNodeSingle swapPairs(ListNodeSingle head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNodeSingle pre = null;
        ListNodeSingle curr = head;
        ListNodeSingle next = head.next;
        ListNodeSingle newHead = head.next;


        while (curr != null && next != null) {
            ListNodeSingle newCurr = next.next;
            next.next = curr;
            curr.next = newCurr;
            if (pre != null) {
                pre.next = next;
            }
            pre = curr;
            curr = newCurr;
            if (newCurr != null) {
                next = newCurr.next;
            } else {
                next = null;
            }
        }
        return newHead;
    }
}
