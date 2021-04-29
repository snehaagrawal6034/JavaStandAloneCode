package list.SinglyList;

    class MyLinkedList {
        Node head;
        Node tail;
        /** Initialize your data structure here. */

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            int counter = 0;
            Node headCopy = head;
            while (headCopy != null && counter < index) {
                headCopy = headCopy.next;
                counter++;
            }
            if (headCopy == null) {
                return -1; // index not present or list empty
            }
            return headCopy.data;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node node = new Node(val);
            node.next = head;
            if (head == null) {
                tail = node;
            }
            head = node;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node node = new Node(val);
            if (tail == null) {
                tail = node;
                head = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            System.out.println("addAtIndex");

            Node newNode = new Node(val);
            int counter=0;

            if(index == 0) {
                addAtHead(val);
                return;
            }
            Node copy = head;

            while(copy.next!=null && counter < index){
                copy=copy.next;
                counter++;
            }
            if(copy.next!=null && counter == index){
                Node tmp = copy.next;
                copy.next=newNode;
                newNode.next= tmp;
            }
            else if(copy.next==null && index==counter) {
                copy.next=newNode;
                copy.next.data=val;
            }

        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            int counter = 0;
            Node copy = head;
            if (head == null) {
                return;
            }
            if (index == 0) {
                head = head.next;
                // 1-node case
                if (head == null) {
                    tail = null;
                }
                return;
            }
            while (counter < index - 1 && copy != null) {
                copy = copy.next;
            }

            if (copy != null) {
                if (copy.next != null) {
                    copy.next = copy.next.next;
                }
            }
        }

/**
 * Your MyLinkedList object will be instantiated and called as such:*/
public static void main(String[] args) {
    MyLinkedList obj = new MyLinkedList();
    int param_1 = obj.get(1);
    obj.addAtHead(7);
    obj.addAtTail(10);
    System.out.println(obj.get(2));
    obj.addAtIndex(9, 9);
    obj.deleteAtIndex(9);
    System.out.println(obj.get(3));
}

    public static class Node {
        int data;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }

        public Node(int data) {
            this.data = data;
        }
    }
}

