class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListBasics {

    // Print Linked List
    static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Insert at Beginning
    static ListNode insertAtHead(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        newNode.next = head;
        head = newNode;

        return head;
    }

    // Insert at End
    static ListNode insertAtTail(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            return newNode;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Search Element
    static boolean search(ListNode head, int target) {
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == target) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Count Nodes
    static int size(ListNode head) {
        int count = 0;

        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Delete First Node
    static ListNode deleteHead(ListNode head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    // Delete Last Node
    static ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    // Reverse Linked List
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = null;

        // Insert at End
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 20);
        head = insertAtTail(head, 30);

        System.out.println("Original List:");
        printList(head);

        // Insert at Beginning
        head = insertAtHead(head, 5);

        System.out.println("After Insert at Head:");
        printList(head);

        // Search
        System.out.println("Search 20: " + search(head, 20));
        System.out.println("Search 100: " + search(head, 100));

        // Size
        System.out.println("Size: " + size(head));

        // Delete Head
        head = deleteHead(head);

        System.out.println("After Delete Head:");
        printList(head);

        // Delete Tail
        head = deleteTail(head);

        System.out.println("After Delete Tail:");
        printList(head);

        // Reverse
        head = reverse(head);

        System.out.println("After Reverse:");
        printList(head);
    }
}
