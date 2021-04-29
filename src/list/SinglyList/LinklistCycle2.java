package list.SinglyList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// To - understand how to string works and how this node creation worked.
public class LinklistCycle2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return head;
            } else {
                nodesSeen.add(head); // 11, 12, 13, 4, 5, 6,
            }
            head = head.next;
        }
        return null;
    }

    public static void main(String[] args) {
        LinklistCycle2 linkedListCycle = new LinklistCycle2();
        List<Integer> integers = Arrays.asList(11,12,13,4,5,6);
        ListNode dummyHead = new ListNode(-1);
        ListNode dummyHeadCopy = dummyHead;
        ListNode secondNodeAddress = null; // -1 -> 11 -> 12
        for (Integer integer : integers) {
            dummyHead.next = new ListNode(integer);
            if (integer == 12) {
                secondNodeAddress = dummyHead.next;
            }
            if (integer == 6) {
                dummyHead.next = secondNodeAddress;
            }
            dummyHead = dummyHead.next;
        }
        System.out.println(linkedListCycle.detectCycle(dummyHeadCopy.next));

    }

    public static class ListNode {
        int val;
        ListNode next;

//        @Override
//        public String toString() {
//            return "ListNode{" +
//                    "val=" + val +
//                    '}';
//        }

        public ListNode(int data) {
            this.val = data;
        }
    }
}
