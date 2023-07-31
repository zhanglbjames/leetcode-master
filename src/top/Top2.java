package top;

import common.ListNodeSingle;

public class Top2 {


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

        public static class Solution {
            public ListNode reverseKGroup(ListNode head, int k) {
                if (k == 1) {
                    return head;
                }
                ListNode nxgHead = head;
                ListNode lastGTail = null;

                ListNode newHead = head;
                for (; ; ) {
                    ListNode tail = needReverse(nxgHead, k);
                    if (tail == null) {
                        if (lastGTail != null) {
                            lastGTail.next = nxgHead;
                        }
                        break;
                    }
                    ListNode nextHeadTemp = tail.next;
                    tail.next = null;
                    ListNode newGHead = reverse(nxgHead);

                    if (lastGTail != null) {
                        lastGTail.next = newGHead;
                    }
                    lastGTail = nxgHead;
                    if (newHead == head) {
                        newHead = newGHead;
                    }
                    nxgHead = nextHeadTemp;

                }
                return newHead;


            }

            private ListNode reverse(ListNode gHead) {
                if (gHead == null || gHead.next == null) {
                    return gHead;
                }
                ListNode curr = gHead;
                ListNode next = gHead.next;
                gHead.next = null;

                for (; ; ) {
                    ListNode newNext = next.next;
                    next.next = curr;
                    curr = next;
                    if (newNext == null) {
                        break;
                    }
                    next = newNext;
                }


                return next;

            }

            private ListNode needReverse(ListNode gHead, int k) {
                ListNode next = gHead;
                while (next != null && k > 1) {
                    k--;
                    next = next.next;
                }
                return next;
            }
        }
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 1;

        ListNode node2 = new ListNode();
        node2.val = 2;

        ListNode node3 = new ListNode();
        node3.val = 3;

        ListNode node4 = new ListNode();
        node4.val = 4;

        ListNode node5 = new ListNode();
        node5.val = 5;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        ListNode.Solution solution = new ListNode.Solution();

        ListNode head = solution.reverseKGroup(node1, 3);
        System.out.println(head.val);

    }
}
