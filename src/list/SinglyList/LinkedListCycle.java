package list.SinglyList;

import java.util.*;

public class LinkedListCycle {


    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        List<Integer> integers = Arrays.asList(11,12,13,4,5,6);
        ListNode dummyHead = new ListNode(-1);
        ListNode dummyHeadCopy = dummyHead;
        ListNode secondNodeAddress = null;
        for (Integer integer : integers) {
            dummyHead.next = new ListNode(integer);
            if (integer == 12) {
                secondNodeAddress = dummyHead;
            }
            if (integer == 6) {
                dummyHead.next = secondNodeAddress;
            }
            dummyHead = dummyHead.next;
        }
        System.out.println(linkedListCycle.hasCycle(dummyHeadCopy.next));

    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        public ListNode(int data) {
            this.val = data;
        }
    }
}
