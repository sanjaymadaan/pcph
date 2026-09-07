package com.company.stack;

/**
 * Represents a stack of integers implemented using an array.
 *
 * A stack follows the LIFO (Last-In, First-Out) principle.
 * The element inserted last is the first element to be removed.
 */
class Stack {

    // Array used to store stack elements
    private int[] arr;

    // Index representing the top of the stack
    // -1 indicates that the stack is empty
    private int tos;

    /**
     * Constructor initializes the stack with a default capacity of 10.
     */
    Stack() {
        arr = new int[10];
        tos = -1;
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the integer value to be inserted
     */
    void push(int element) {

        // Check whether the stack is full
        if (tos >= arr.length - 1) {
            System.out.println("Stack Overflow: Cannot push " + element);
        } else {
            // Increment top-of-stack and insert the element
            tos++;
            arr[tos] = element;
        }
    }

    /**
     * Removes and returns the element from the top of the stack.
     *
     * return the removed element, or 0 if the stack is empty
     */
    int pop() {

        // Check whether the stack is empty
        if (tos == -1) {
            System.out.println("Stack Underflow: Stack is empty.");
            return 0;
        }

        // Store the top element before removing it
        int element = arr[tos];

        // Decrease the top-of-stack index
        tos--;

        return element;
    }

    /**
     * Returns the element at the top of the stack
     * without removing it.
     *
     * return the top element, or 0 if the stack is empty
     */
    int peek() {

        // Check whether the stack is empty
        if (tos == -1) {
            System.out.println("Stack Underflow: Stack is empty.");
            return 0;
        }

        // Return the top element without modifying tos
        return arr[tos];
    }

    /**
     * Checks whether the stack is empty.
     *
     * return true if the stack is empty; otherwise false
     */
    boolean isEmpty() {
        return tos == -1;
    }

    /**
     * Displays all elements currently present in the stack.
     * Elements are displayed from bottom to top.
     */
    void displayStack() {

        System.out.println("\nStack Elements:");

        // Check whether the stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        // Display elements from bottom to top
        for (int i = 0; i <= tos; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}


/**
 * Demonstrates the basic operations of the Stack class.
 */
public class StackDemo1 {

    public static void main(String[] args) {

        // Create a Stack object
        Stack s1 = new Stack();

        // ------------------------------------------------
        // Attempt to remove an element from an empty stack
        // ------------------------------------------------
        System.out.println("Attempting to pop from an empty stack:");
        s1.pop();

        // Check whether the stack is empty
        System.out.println("\nStack is Empty? " + s1.isEmpty());

        // ------------------------------------------------
        // Push an element onto the stack
        // ------------------------------------------------
        System.out.println("\nPushing 34 onto the stack:");
        s1.push(34);

        // Display stack elements
        s1.displayStack();

        // Check whether the stack is empty
        System.out.println("Stack is Empty? " + s1.isEmpty());

        // ------------------------------------------------
        // View the top element using peek()
        // ------------------------------------------------
        System.out.println("\nElement at Top of Stack = " + s1.peek());

        // Display stack without removing the element
        s1.displayStack();

        // ------------------------------------------------
        // Remove the top element using pop()
        // ------------------------------------------------
        System.out.println("\nPopped Element = " + s1.pop());

        // Display stack after pop operation
        s1.displayStack();

        // Check whether the stack is empty again
        System.out.println("Stack is Empty? " + s1.isEmpty());
    }
}