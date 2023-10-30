import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ListNode headNode; // Declare the head node of the list
        ListNode lastNode; // Keeps track of the last node
        ListNode currNode; // Keeps track of current node

        // Getting the number of list items from the user
        System.out.println("How many items in your list?");
        int input = scnr.nextInt();
        scnr.nextLine(); // Consumes the remaining newline

        // Getting list items from user
        System.out.println("Add list of items.");
        headNode = new ListNode(); // Initializing the headNode
        lastNode = headNode;

        // Populating the linked list from user input
        for(int i = 0; i < input; i++) {
            String item = scnr.nextLine();
            currNode = new ListNode(item);
            lastNode.insertAtEnd(headNode, currNode);
            lastNode = currNode;
        }

        boolean validInput = false;

        do {
            try {
                System.out.println("Commands: <1> Print list <2> Reverse and print list");
                int cmd = scnr.nextInt();

                if (cmd == 1) {
                    // Printing the linked list
                    currNode = headNode.getNext(); // Removed the type declaration here
                    while (currNode != null) {
                        currNode.printNodeData();
                        currNode = currNode.getNext();
                    }
                    validInput = true;
                } else if (cmd == 2) {
                    // Reverse the linked list, excluding the initial dummy head.
                    headNode.setNext(ListNode.reverseList(headNode.getNext()));
                    validInput = true;
                } else {
                    System.out.println("Invalid command. Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scnr.next(); // Clear the buffer
            }
        } while (!validInput);

        scnr.close(); // Closing the scanner to prevent resource leak
    }
}
