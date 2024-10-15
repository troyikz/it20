/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic_3_stack_calculator;


public class Stack_Calculator {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack_Calculator(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        if (value < 0 || value > 9) {
            System.out.println("Only values between 0-9 are allowed.");
            return;
        }
        stackArray[++top] = value;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
        return stackArray[top];
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int performOperation(String operation) {
        if (size() < 2) {
            System.out.println("Not enough elements in the stack to perform operation.");
            return -1;
        }
        
        int b = pop();
        int a = pop();
        int result = 0;
        
        switch (operation) {
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    return -1;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation.");
                return -1;
        }
        
        push(result);  // Push the result back onto the stack
        return result;
    }
}