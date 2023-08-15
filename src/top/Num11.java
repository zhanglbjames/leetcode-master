package top;

public class Num11 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    static class Solution {
        public void reorderList(ListNode head) {
            if (head == null || head.next == null) {
                return;
            }

            int len = 0;
            ListNode tail = head;
            while (tail != null) {
                tail = tail.next;
                len++;
            }

            if (len <= 2) {
                return;
            }

            ListNode midPre = null;
            ListNode mid = head;
            for (int i = 0; i < len / 2; i++) {
                midPre = mid;
                mid = mid.next;
            }

            ListNode rightHead = reverse(mid);
            midPre.next = null;

            ListNode p1 = head, p2 = rightHead, dummyHead = new ListNode(), p = dummyHead;

            boolean selectTag = true;
            while (p1 != null || p2 != null) {
                if (selectTag) {
                    if (p1 != null) {
                        p.next = p1;
                        ListNode next = p1.next;
                        p1.next = null;
                        p1 = next;
                        p=p.next;

                    }
                } else {
                    if (p2 != null) {
                        p.next = p2;
                        ListNode next = p2.next;
                        p2.next = null;
                        p2 = next;
                        p=p.next;
                    }
                }
                selectTag = !selectTag;
            }
        }

        private ListNode reverse(ListNode head) {
            ListNode dummyHead = new ListNode(-1, head);

            ListNode curr = head.next;
            ListNode pre = head;
            while (curr != null) {
                ListNode tmp = curr.next;
                pre.next = curr.next;
                curr.next = dummyHead.next;
                dummyHead.next = curr;
                curr = tmp;
            }

            return dummyHead.next;
        }
    }

    public static void main(String[] args) {
        ListNode node1= new ListNode();
        node1.val = 1;

        ListNode node2= new ListNode();
        node2.val = 2;

        ListNode node3= new ListNode();
        node3.val = 3;

        ListNode node4= new ListNode();
        node4.val = 4;

        ListNode node5= new ListNode();
        node5.val = 5;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        Solution solution = new Solution();
        solution.reorderList(node1);
        System.out.println(node1);
    }
}
