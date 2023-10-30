
public class ListNode {
    private String item;
    private ListNode nextNodeRef; // Reference to the next node

    // Default constructor
    public ListNode() {
        item = "";
        nextNodeRef = null;
    }

    // Constructor to initialize the node with an item
    public ListNode(String itemInit) {
        this.item = itemInit;
        this.nextNodeRef = null;
    }

    // Insert a new node after the current node
    public void insertAfter(ListNode nodeLoc) {
        nodeLoc.nextNodeRef = this.nextNodeRef;
        this.nextNodeRef = nodeLoc;
    }

    // Insert a new node at the end of the linked list
    public void insertAtEnd(ListNode head, ListNode newNode) {
        ListNode currNode = head;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
        }
        currNode.setNext(newNode);
    }

    // Getters and setters
    public ListNode getNext() {
        return this.nextNodeRef;
    }

    public void setNext(ListNode loc) {
        this.nextNodeRef = loc;
    }

    // Method to print node data
    public void printNodeData() {
        System.out.println(this.item);
    }

    // Method to reverse the linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode;

        while (currNode != null) {
            nextNode = currNode.getNext(); // temporarily save the next node
            currNode.setNext(prevNode); // reverse the current node's pointer
            prevNode = currNode; // move the prevNode and currNode pointers up by one node
            currNode = nextNode;
        }
        return prevNode; // new head of the reversed list
    }
}