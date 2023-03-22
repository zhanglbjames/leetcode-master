package list;

import common.ListNodeSingle;

public class List0203 {

    public ListNodeSingle removeElements(ListNodeSingle head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNodeSingle curr = head;
        while (curr != null) {
            while (curr.next != null && curr.next.val == val) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }

        return head;
    }
}
