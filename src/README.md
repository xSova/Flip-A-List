# Linked List Manipulation in Java

## Project Description

This Java application is designed to manipulate a singly linked list of strings. The user can interact with the application to create a linked list, print the linked list, and reverse the linked list.

## Files

### Main.java

The `Main.java` file contains the `main` method, which is the entry point of the application. This file handles user inputs and controls the flow of execution. It performs the following functionalities:

- **Creating the Linked List:**  
  It prompts the user to enter the number of items and the items to be included in the linked list.

- **User Commands:**  
  The application will ask users for commands to either print the list or reverse and print the list. It continues to prompt the user until a valid command is entered.

### ListNode.java

The `ListNode.java` file contains the definition of the `ListNode` class, which represents a node in the linked list. Each node contains a string item and a reference to the next node in the list. The class includes methods to:

- **Insert After:**  
  Inserts a node after the current node.

- **Insert At End:**  
  Inserts a node at the end of the list.

- **Reverse List:**  
  Reverses the linked list.

## How to Run

1. Compile both Java files:
   ```bash
   javac Main.java ListNode.java
   ```
2. Follow the on-screen instructions to manipulate the linked list.

## User Guide

- The program will first ask you to enter the number of items you want in your list.
- Next, you will enter each item one at a time.
- You will then be given two commands to choose from:
  - `<1> Print list`
  - `<2> Reverse list`
- Enter the number corresponding to the command you wish to execute.
- The program will execute the chosen command and output the result.

## Known issues:
- There is little error handling on the side of user input, so do not input ints where the program expects a string.