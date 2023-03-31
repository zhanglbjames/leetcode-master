package list;

import common.ListNodeSingle;

public class List0206 {

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

        ListNodeSingle nodeSingle = reverseList(node1);
        System.out.println(nodeSingle.val);
    }


    public static ListNodeSingle reverseList(ListNodeSingle head) {
        if (head == null) {
            return null;
        }
        ListNodeSingle pre = head;
        ListNodeSingle curr = head.next;
        pre.next = null;
        while (curr != null) {
            ListNodeSingle newCurr = curr.next;
            curr.next = pre;
            pre = curr;
            curr = newCurr;
        }

        return pre;
    }
}
