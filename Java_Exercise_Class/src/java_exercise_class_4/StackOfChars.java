/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_4;

/**
 *
 * @author admin
 */
public class StackOfChars {

    private char elements[];
    private int size;

    public StackOfChars() {
        elements = new char[16];
        size = 0;
    }

    public StackOfChars(int capacity) {
        elements = new char[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public char peak() {
        return elements[size];
    }

    public void push(char ch) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        } else {
            size = size + 1;
            elements[size] = ch;
        }
    }

    public char pop() {
        char temp = '0';
        if (isEmpty()) {
            return temp;
        } else {
            temp = elements[size];
            size = size - 1;
        }
        return temp;
    }

    public int getSize() {
        return size;
    }
}
